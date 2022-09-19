package com.day15;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JVM으로 자동으로 검색할 수 있는 패키지는 java.lang 뿐이기 때문에 그 밖의 패키지에 대해서는 반드시 import를 해주어야 한다.
import javax.swing.JButton;
import javax.swing.JFrame;
public class A_3 extends JFrame implements ActionListener{ 
	B_3 b = new B_3();
	JButton jbtn_insert = new JButton("입력");
	JButton jbtn_edit   = new JButton("수정");
	JButton jbtn_detail = new JButton("상세보기");
	
	public void initDisplay() {
		System.out.println("initDisplay 호출성공");
		jbtn_insert.addActionListener(this);
		jbtn_edit.addActionListener(this);
		jbtn_detail.addActionListener(this);
		this.add(jbtn_insert);
		this.add(jbtn_edit);
		this.add(jbtn_detail);
		this.setTitle("임시 창");
		this.setVisible(true);
		this.setSize(400, 500);
	    this.setLayout(new FlowLayout());
	}////////// end of initDisplay
	
	public static void main(String[] args) {
			A_3 a = new A_3(); 
			a.initDisplay(); 
		System.out.println("initDisplay 호출 후 ...");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jbtn_insert) { 
			System.out.println("입력버튼 눌렸다");
		} else if(obj == jbtn_edit) {
			System.out.println("수정버튼 눌렸다");
		} else if(obj == jbtn_detail) {
			System.out.println("상세보기 버튼 눌렸다");
		}
	}

}
