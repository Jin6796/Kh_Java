package com.day18;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//java.lang이 아닌 모든 패키지는 JVM이 접근할 수 없기 때문에 import를 해주어야 한다.
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ToDoListView extends JFrame implements ActionListener {
	JLabel jlb_timer = new JLabel ("현재시간: ");
	Font f = new Font("돋움체",Font.BOLD, 30);
	JButton tn = new JButton("닫기");
	String title = null;
	
	public ToDoListView () {
		// 화면을 그리는 메소드를 디폴트 생성자에서 호출해보기 - 표현력을 키운다, 위치를 다양하게 표현하기
		// 생성자 안에서 호출할 때는 인스턴스화가 필요없다. > 직접 호출이 가능하다.
		initDisplay();
		//객체 주입
//		TimeClient tc = new TimeClient(this.jlb_timer); // 라벨이 아니라 String으로
		TimeClient tc = new TimeClient(this.title);
		tc.start(); // run()호출이 된다 - Thread 검색 start()
	}
	public void initDisplay() {
		this.setTitle(this.title);
		jlb_timer.setFont(f);
//		this.setTitle("시간 안내");
		this.setSize(500,400);
		this.setVisible(true);
		this.add("Center", jlb_timer);
		this.setLayout(new FlowLayout()); 
		// BorderLayout은 동서남북으로 배치, FlowLayout은 중앙부터 양쪽으로 배치가 된다.
		this.add("South", tn);
		tn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(tn == obj) {
			String label = tn.getText();
			System.out.println(label);
			this.set(label, true);
			
		}
	}

	private void set(String label, boolean False) {
		this.setVisible(False);
	}
	public static void main(String[] args) {
		ToDoListView tdlv = new ToDoListView();
		
	}

}
