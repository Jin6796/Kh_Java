package com.day20;

import java.net.ServerSocket;
import java.net.Socket;

public class NetworkServer {
	public void serverUp () {
		int port = 4444;
	
		ServerSocket server = null;
		try {
			server = new ServerSocket(port);
			System.out.println("server: " + server);
			while(true) {
				Socket client = server.accept();
				System.out.println("client socket: " + client);
			}
		} catch (Exception e) {
			e.printStackTrace(); // 라인번호와 함께 메세지까지 출력받을 수 있다. "디버깅하는 데에 꼭 필요한 메소드"
		}
	}
	
	public static void main(String[] args) {
		NetworkServer ns = new NetworkServer();
		ns.serverUp();
	}

}
