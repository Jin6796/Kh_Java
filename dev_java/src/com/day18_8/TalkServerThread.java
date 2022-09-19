package com.day18_8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.StringTokenizer;
public class TalkServerThread extends Thread {
	Socket 					client 	= null;
	ObjectOutputStream 		oos 	= null;
	ObjectInputStream 		ois 	= null;
	String 			        nickName = null;
	TalkServer               ts = null;
	public TalkServerThread(TalkServer ts) {
		this.ts = ts;
		this.client = ts.client;
		try {
			oos = new ObjectOutputStream(client.getOutputStream());
			ois = new ObjectInputStream(client.getInputStream());
			String msg = (String)ois.readObject();
			StringTokenizer st = new StringTokenizer(msg,"#");
			st.nextToken();//100
			nickName = st.nextToken();
			ts.jta_log.append(nickName+"님 입장하였습니다.\n");
			for(TalkServerThread tst:ts.globalList) {
				this.send(msg);
			}
			ts.globalList.add(this);//현재 동작하는 스레드 -this - 나는  누구? 스레드를 상속받았잖아
			this.broadCasting(msg);
		} catch (Exception e) {
		}
	}
	public void broadCasting(String msg) {
		for(TalkServerThread tst:ts.globalList) {// globalList는 벡터 new Vector<>();
			tst.send(msg);
		}
	}
	public void send(String msg) {
		try { 
			oos.writeObject(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		String msg = "";
		boolean isStop = false;
		while(!isStop) {
			try {
				msg = (String)ois.readObject();
				ts.jta_log.append(msg+"\n");
				StringTokenizer st = null;
				int protocol = 0;
				if(msg !=null) {
					st = new StringTokenizer(msg, "#");
					protocol = Integer.parseInt(st.nextToken());
				}
				switch(protocol) {
					case 200:{
						String nickName = st.nextToken();
						String message = st.nextToken();
						broadCasting(200+"#"+nickName+"#"+message);
					}break;
				}///// end of switch
				
			} catch (Exception e) {
			}
		}
	}// end of run()	
}









