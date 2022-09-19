package test.kh0518;

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
			e.printStackTrace(); 
		}
	}
	
	public static void main(String[] args) {
		NetworkServer ns = new NetworkServer();
		ns.serverUp();
	}

}
