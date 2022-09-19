package com.day15;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JVM으로 자동으로 검색할 수 있는 패키지는 java.lang 뿐이기 때문에 그 밖의 패키지에 대해서는 반드시 import를 해주어야 한다.
import javax.swing.JButton;
import javax.swing.JFrame;
public class A_4 extends JFrame implements ActionListener{
	
	private JButton btnInsert = new JButton("입력");
	private JButton btnUpdate = new JButton("수정");
	private JButton btnDelete = new JButton("삭제");
	private JButton btnSelect = new JButton("조회");
	private JButton btnDetail = new JButton("상세보기");
	B_4 b_4 = new B_4 ();
	
	public void initDisplay() {
		btnInsert.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnDelete.addActionListener(this);
		btnSelect.addActionListener(this);
		btnDetail.addActionListener(this);
		this.add(btnInsert);
		this.add(btnUpdate);
		this.add(btnDelete);
		this.add(btnSelect);
		this.add(btnDetail);
		this.setVisible(true);
		this.setTitle("최경진");
		this.setSize(400, 500);
	    this.setLayout(new FlowLayout());

	}////////// end of initDisplay
	
	public static void main(String[] args) {
			A_4 a = new A_4();
			a.initDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		// if 문 세번이면 무무조건 비교를 세 번 하게 되므로 비효율적이다.
		// 만일 else-if로 하였다면 위의 조건이 만족되었을 때 아래 조건은 따지지 않으니 비용이 절약된다.
		// 부모 창이 열릴 때 열리는 창의 타이틀은 부모창에서 결정된다.
		// 부모창에서 어떤 버튼이 선택되는가에 따라 자손창의 제목이 결정됨 - 구조
		if(obj == btnInsert) { 
			String label = btnInsert.getText();
			System.out.println(label);
			b_4.set(label, true);
		} else if(obj == btnUpdate) {
			String label = btnUpdate.getText();
			System.out.println(label);
			b_4.set(label, true);
		} else if(obj == btnDetail) {
			String label = btnDetail.getText();
			System.out.println(label);
			b_4.set(label, true);
		} else if(obj == btnSelect) {
			String label = btnSelect.getText();
			System.out.println(label);
			b_4.set(label, true);
		} else if (obj == btnDelete) {
			String label = btnDelete.getText();
			System.out.println(label);
			b_4.set(label, true);
			}
		}
	}


