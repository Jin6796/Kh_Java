package test.kh0518;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	public void client() {
		int port = 3000;
		String serverIP;
		
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			
			Socket socket = new Socket(serverIP, port);
			System.out.println("serverIP: " + serverIP);
			System.out.println("NetworkClient socket: " + socket);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
	public static void main(String[] args) {
		Client mc = new Client();
		mc.client();
	}
}
