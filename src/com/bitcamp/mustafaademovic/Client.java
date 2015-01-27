package com.bitcamp.mustafaademovic;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static final String serverAdress = "127.0.0.1";
	public static final int port = 1717;

	private static void connectToServer() throws UnknownHostException,
			IOException {
		Socket client = new Socket(serverAdress, port);
		SocketRW sc = new SocketRW(client.getInputStream(),
				client.getOutputStream());
		Scanner scanner = new Scanner(System.in);
		while (true) {

			String message = sc.recieve();
			System.out.println("Server: " + message);
			if (message.equals("quit")) {
				break;
			}

		}

		System.out.println("\nGotovo");
		client.close();
		scanner.close();

	}

	public static void main(String[] args) {
		try {
			connectToServer();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
