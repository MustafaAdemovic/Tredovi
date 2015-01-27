package com.bitcamp.mustafaademovic;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;

public class MouseCoordinates2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {

			Robot r = new Robot();
			while (true) {
				System.out.println("Enter x coordinates: ");
				int x = scanner.nextInt();
				System.out.println("Enter y coordinates: ");
				int y = scanner.nextInt();

				r.mouseMove(x, y);
			}
		} catch (AWTException e) {

			e.printStackTrace();
		} finally {

			if (scanner.nextLine() != null) {
				scanner.close();
			}
		}

	}

}
