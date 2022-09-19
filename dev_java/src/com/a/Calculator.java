package com.a;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Calculator extends JFrame implements ActionListener {
	Scanner sc = new Scanner(System.in);
	
	String [] btn = {"7", "8", "9","%", "4","5","6","*","1","2","3","-",".","0","+" };
	JButton [] jbtn = new JButton[16];
//	JButton btn_plus = new JButton("+");
//	JButton btn_minus = new JButton("-");
//	JButton btn_multi = new JButton("*");
//	JButton btn_divi = new JButton("%");
//	JButton btn_zero = new JButton("0");
//	JButton btn_one = new JButton("1");
//	JButton btn_two = new JButton("2");
//	JButton btn_three = new JButton("3");
//	JButton btn_four = new JButton("4");
//	JButton btn_five = new JButton("5");
//	JButton btn_six = new JButton("6");
//	JButton btn_seven = new JButton("7");
//	JButton btn_eight = new JButton("8");
//	JButton btn_nine = new JButton("9");
//	JButton btn_dot = new JButton(".");
//	JButton btn_result = new JButton("=");
	JPanel jp = new JPanel();
	JTextArea jta_display = new JTextArea(10, 20);
	CalculatorSimulation cs = new CalculatorSimulation();
	
	public Calculator() {
		initDisplay();
	}
	public void initDisplay() {
		this.setLayout(new FlowLayout());
//		btn_plus.addActionListener(this);
//		btn_minus.addActionListener(this);
//		btn_multi.addActionListener(this);
//		btn_divi.addActionListener(this);
//		this.add(btn_seven);
//		this.add(btn_eight);
//		this.add(btn_nine);
//		this.add(btn_divi);
//		this.add(btn_four);
//		this.add(btn_five);
//		this.add(btn_six);
//		this.add(btn_multi);
//		this.add(btn_one);
//		this.add(btn_two);
//		this.add(btn_three);
//		this.add(btn_minus);
//		this.add(btn_dot);
//		this.add(btn_zero);
//		this.add(btn_result);
//		this.add(btn_plus);
		this.add("South", jta_display);
		this.setTitle("계산기 Ver1.0");
		this.setSize(220, 300);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Object obj = ae.getSource();
//		if(btn_plus == obj) {
//		System.out.println("+");
//		}else if(btn_zero == obj) {
//			System.out.println("0");
//		}
	}
	
	public static void main(String[] args) {
		Calculator cl = new Calculator();
		cl.initDisplay(); 
	}


	
}
