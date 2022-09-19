package test.kh0503;

import java.net.*;
import java.io.*;
import java.util.*;
public class TimeServer extends Thread {
	private Socket socket;

	public TimeServer(Socket s) {
		this.socket = s;
	}
	@Override
	public void run() {
		System.out.println("run call....");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			while (true) {
				oos.writeObject(getTimeStr());
				try {
					sleep(1000);
				} catch (InterruptedException i) {
					System.out.println("다른 스레드가 인터셉트 해오면 잡히게 됨. 뭐래!!!");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("\nClient disconnected...\n");
			try {
				socket.close();
			} catch (IOException e) {
			}
		}
	}
	private String getTimeStr() {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		return (hour < 10 ? "0" + hour : "" + hour) + ":" + (min < 10 ? "0" + min : "" + min) + ":"
				+ (sec < 10 ? "0" + sec : "" + sec);

	}
	public static void main(String args[]) {
		int port = 9888;
		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println("Can't bind port: " + port);
			e.printStackTrace();
			try {
				server.close();
			} catch (IOException i) {
			}
			System.exit(0);
		}
		System.out.println("Time Server started successfully...");

		while (true) {
			try {
				client = server.accept();
				System.out.println("New Client connected...");
				TimeServer tServer = new TimeServer(client);
				tServer.start();

				System.out.println("New Time Server Thread started...");

			} catch (IOException e) {
				System.out.println("Can't start server thread!!");
				e.printStackTrace();
				try {
					client.close();
				} catch (IOException i) {
				}
			}
		}
	}
}
