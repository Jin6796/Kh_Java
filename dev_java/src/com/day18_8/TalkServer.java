package com.day18_8;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TalkServer extends JFrame implements Runnable {
	List<TalkServerThread> globalList = null;
	ServerSocket server = null;
	Socket       client = null;
	JTextArea jta_log = new JTextArea(10, 30);
	JScrollPane jsp_log = new JScrollPane(jta_log,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
	                                    , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	public TalkServer() {
		
	}
	@Override
	public void run() {
		globalList = new Vector<>();
		boolean isStop = false;
		try {
			server = new ServerSocket(3005);
			jta_log.append("Server Ready .....................\n");
			while(!isStop) {
				client = server.accept();
				jta_log.append("client info"+ client.getInetAddress()+"\n");
				TalkServerThread tst = new TalkServerThread(this);
				tst.start();
			}
		} catch (Exception e) {
		}

	}
	public void initDisplay() {
		this.add("Center", jsp_log);
		this.setTitle("서버 로그창");
		this.setSize(500, 400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		TalkServer ts = new TalkServer();
		ts.initDisplay();
		Thread th = new Thread(ts);
		th.start();
	}

}
