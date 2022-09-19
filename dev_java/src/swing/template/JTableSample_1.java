package swing.template;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableSample_1 implements ActionListener {
	// 윈도우 운영체제에서 창을 생성하기
	JFrame jf = new JFrame();
	// 테이블의 헤더를 구성할 때 사용할 1차 배열 선언
	String cols[] = {"HTML","자바","오라클","총점","평균"};
	// JTable은 테이블 양식만 제공할 뿐, 실제 데이터를 담는 클래스는 DefaultTableModel이다.
	// 실제로 데이터를 가지고 있는 것은 2차 배열이다.
	String data[][] = new String[1][5];
	// 만일 값을 접근하려면 DefaultTableModel안에 데이터 셋이 있다.
	DefaultTableModel dtm = new DefaultTableModel(data, cols);
	// 나는 양식일 뿐 데이터를 가지고 있지 않아.
	JTable 			  jtb = new JTable(dtm);
	JScrollPane 	  jsp = new JScrollPane(jtb
            ,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
            ,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	// 속지를 그리는데 사용됨 - 이 속지에 처리 버튼과 종료 버튼을 추가해보자.
	JPanel jp_south = new JPanel();
	JButton jbtn_account = new JButton("성적처리");
	JButton jbtn_exit = new JButton("종료");
	
	public void initDisplay() {
		jbtn_account.addActionListener(this);
		jbtn_exit.addActionListener(this);
		jp_south.add(jbtn_account);
		jp_south.add(jbtn_exit);
		jp_south.setBackground(Color.orange);
		jf.add("South", jp_south);
		jf.add("Center",jsp);
		jf.setSize(500, 400);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		JTableSample_1 jtb = new JTableSample_1();
		jtb.initDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e) { // JAVA에서 파라미터를 주입해주기 때문에 null이 아니다.
		Object obj = e.getSource();
		if(obj == jbtn_account) {
			String html = (String)dtm.getValueAt(0, 0);
			String java = (String)dtm.getValueAt(0, 1);
			String oracle = (String)dtm.getValueAt(0, 2);
			int hap = Integer.parseInt(html)+Integer.parseInt(java)+Integer.parseInt(oracle);
			double ave = hap/3.0;
			dtm.setValueAt(hap, 0, 3);
			dtm.setValueAt(ave, 0, 4);
		} else if (obj == jbtn_exit) {
			jf.setVisible(false);
		}
	}

}
