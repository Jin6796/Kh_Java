package com.day18;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JLabel;

public class TimeClient extends Thread {

//	private JLabel label;
	public String str;
//	ToDoListView toDoListView =null;
	
	public TimeClient(){}
	
//	public TimeClient(JLabel label) {
//		System.out.println("label:"+label);
//		this.label = label;
//	}
	public TimeClient(String str) {
	System.out.println("label:"+str);
	this.str = str;
	}	

//	public TimeClient(ToDoListView toDoListView) {
//		this.toDoListView = toDoListView;
//	}

	// run() 시작
	public void run() {

		Socket socket = null;
		ObjectOutputStream  oos = null;
		ObjectInputStream  ois = null;
		String timeStr = null;
   
		try {
			// 클라이언트 측에서 아래 인스턴스화가 실행되면, ServerSocket에 정보가 전달된다. - 접속이 된다.
			// 1. 서버측의 아이피 주소를 넣어야 한다.
			// 2. 서버가 지정한 포트 번호를 넣어어야 한다.
			socket = new Socket("127.0.0.1", 9888); 
			// 생성된 소켓이 있어야 출력을 담당하는 객체를 생성할 수 있다.
			// 생성자 파라미터 자리에 소켓.getOutputStream()으로 객체가 생성이 된다. - 헌재 시간 정보를 소켓에 말하기/쓰기 담당
			oos = new ObjectOutputStream(socket.getOutputStream());
			// 서버측에서 보낸 메세지를 읽어오는 데 사용한다. 객체를 생상 할 때 반드시 Socket 객체가 생성되어 있어야 함.
			ois = new ObjectInputStream(socket.getInputStream());
			while(true) {
				timeStr = ois.readObject().toString();
			    System.out.println(timeStr);
//			    toDoListView.setTitle(timeStr);
			    str=(timeStr);
			    
//			    label.setText(timeStr);
//				Thread.yield();
				try {
					Thread.sleep(1000);
				} catch(InterruptedException i) {
 			    } 
			}
		} catch(IOException i) {
//			label.setText("타임서버에 접속할 수 없습니다.");
			str=("타임서버에 접속할 수 없습니다.");
		} catch(Exception e) {
			
		} finally {
			try {
				ois.close();
				oos.close();
				socket.close();
			} catch (IOException e) {}
		}
	}
	
	// run() 종료
	public static void main(String args[]){
		TimeClient tc = new TimeClient();
		tc.start(); // run()호출이 된다 - Thread 검색 start()
		
	}

}