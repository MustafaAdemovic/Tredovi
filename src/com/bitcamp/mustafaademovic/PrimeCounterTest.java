package com.bitcamp.mustafaademovic;

public class PrimeCounterTest {

	public static void main(String[] args) {
		PrimeCounter a = new PrimeCounter(1, 100000);
		a.start();
		PrimeCounter b = new PrimeCounter(100001, 200000);
		b.start();
		PrimeCounter c = new PrimeCounter(200001, 300000);
		c.start();
		
		

	}

}
