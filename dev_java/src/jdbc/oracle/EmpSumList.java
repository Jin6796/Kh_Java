package jdbc.oracle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import address.view2.DBConnectionMgr;

public class EmpSumList extends JFrame implements ActionListener{
	JButton jbtn_select = new JButton("조회");
	String headers[] = {"부서명", "CLERK", "MANAGER", "ETC", "DEPT_SAL"};
	String data [][] = new String [0][5];
	DefaultTableModel dtm = new DefaultTableModel(data, headers);
	JTable jtb = new JTable(dtm);
	JScrollPane jsp = new JScrollPane(jtb);
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DBConnectionMgr dbMgr = new DBConnectionMgr();
	
	public EmpSumList() {
		jbtn_select.addActionListener(this);
		initDisplay();
	}
	
	public List<Map<String,Object>> getEmpSumList(){
		System.out.println("getEmpSumList 호출 성공");
		List<Map<String,Object>> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
	sql.append("	SELECT DECODE(b.rno, 1, a.dname, 2,'총계') as dname,                           ");
	sql.append("       sum(clerk) clerk, sum(manager) manager, sum(etc) etc, sum(dept_sal) dept_sal   ");
	sql.append("  FROM(SELECT dname,                                                                  ");
	sql.append("            SUM(DECODE(job,'CLERK', sal)) clerk,                                      ");
	sql.append("            SUM(DECODE(job, 'MANAGER', sal)) as manager,                              ");
	sql.append("            SUM(DECODE(job, 'CLERK', null, 'MANAGER', null, sal)) as etc,             ");
	sql.append("            SUM(sal) as dept_sal                                                      ");
	sql.append("             FROM emp, dept                                                           ");
	sql.append("            WHERE emp.deptno=dept.deptno                                              ");
	sql.append("         GROUP BY dname)a,                                                            ");
	sql.append("       (SELECT rownum rno FROM dept WHERE rownum < 3)b                                ");
	sql.append("GROUP BY DECODE(b.rno, 1, a.dname, 2, '총계')                                          ");
	sql.append("ORDER BY dname                                                                        ");
		 try {                                                                                             
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			Map<String, Object> rmap = null;
			while(rs.next()) {
				rmap = new HashMap<>();
				rmap.put("dname", rs.getString(1));
				rmap.put("CLERK", rs.getDouble(2));
				rmap.put("MANAGER", rs.getDouble(3));
				rmap.put("ETC", rs.getDouble(4));
				rmap.put("DEPT_SAL", rs.getDouble(5));
				list.add(rmap);
			}
			System.out.println(list);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return list;
	}
	public void initDisplay() {
		System.out.println("initDisplay 호출 성공");
		this.add("North", jbtn_select);
		this.add("Center", jsp);
		this.setSize(500,400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new EmpSumList();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트가 감지된 컴포넌트의 주소번지
		Object obj = e.getSource();
		if (jbtn_select == obj) {
			System.out.println("조회 버튼 호출 성공");
			getEmpSumList();
		}
		
	}

}
