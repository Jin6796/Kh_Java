package test.kh0518;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
		public void server() {
		int port = 3000;
		
		ServerSocket server;
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
		Server sv = new Server();
		sv.server();
	}
}
