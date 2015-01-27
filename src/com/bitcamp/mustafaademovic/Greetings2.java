package com.bitcamp.mustafaademovic;

public class Greetings2 extends Thread {
	private int id;
	private static int totalCount;

	public Greetings2(int id) {
		super();
		this.id = id;
	}
	public synchronized void increseCount(){//Osigurava da tredovi ne uzimaju iste resurse istovremeno 
		totalCount++;
	}

	public void greetingCounter() {
		for (int i = 0; i < 5; i++) {
			System.out.printf("Hello from %d! Just counted to: %d Total count is: %d\n", id, i, totalCount);
			increseCount();		}
	}

	@Override
	public void run() {
		greetingCounter();
	}

	public static void main(String[] args) {
		Greetings2 []gr = new Greetings2[5];
		for (int i = 0; i < gr.length; i++) {
			gr[i] = new Greetings2(i);
			gr[i].start();
		}
			//Greetings2 g = new Greetings2(i);
			// g.start(); Metoda za pocetak
			//g.run();// Nece se izvrsavati u isto vrijeme blokira kod dok se ne  izvede pa ide sljedeci
			/* run threda jedan po jedan a start treda sve zajedno od jednom */
			for(Greetings2 g : gr){
				try {
					g.join();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			System.out.println("Gotovo!!");
		
		}
		

	}

