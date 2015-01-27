package com.bitcamp.mustafaademovic;

public class PrimeCounter extends Thread {
	private int start;
	private int end;
	private static int counter;

	public PrimeCounter(int start, int end) {
		super();
		this.start = start;
		this.end = end;

	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static int countPrines(int startOfInterval, int endOfInterval) {
		
		for (int i = startOfInterval; i < endOfInterval; i++) {

			if (isPrime(i)) {
				counter++;
			}
		}
		return counter;
	}

	@Override
	public void run() {
	System.out.println(countPrines(start, end));
		
	}
}
