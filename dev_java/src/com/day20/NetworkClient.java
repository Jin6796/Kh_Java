package com.day20;

import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JLabel;

public class NetworkClient {
	JLabel jlb = new JLabel();
	
	public void client_connect() {
		int port = 4444;
		String serverIP = "127.0.0.1";
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
		NetworkClient mc = new NetworkClient();
		mc.client_connect();
	}

}
