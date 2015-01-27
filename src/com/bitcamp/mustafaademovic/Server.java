package com.bitcamp.mustafaademovic;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static final int port = 1717;

	public static void startServer() {
		Scanner scanner = new Scanner(System.in);
		try {
			ServerSocket server = new ServerSocket(port);
			while (true) {
				System.out.println("Waiting");
				Socket client = server.accept();
				SocketRW sc = new SocketRW(client.getInputStream(),
						client.getOutputStream());
				while (true) {
					System.out.print("Client: ");
					String userInput = scanner.nextLine();

					sc.send(userInput);
					if (userInput.equals("quit")) {
						break;
					}
					}
				}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			scanner.close();
			
		}
	}
}
