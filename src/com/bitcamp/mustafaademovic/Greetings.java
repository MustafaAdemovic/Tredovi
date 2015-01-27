package com.bitcamp.mustafaademovic;

public class Greetings {
	private int id;

	public Greetings(int id) {
		this.id = id;
	}

	public void greetingCounter() {
		for (int i = 0; i < 5; i++) {
			System.out.printf("Hello from %d! Just counted to: %d\n", id, i);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Greetings g = new Greetings(i);
			g.greetingCounter();
		}

	}
}
