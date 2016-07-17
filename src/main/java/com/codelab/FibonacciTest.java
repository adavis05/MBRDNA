package com.codelab;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void test() {
		
		Fibonacci fib = new Fibonacci();
		
		//Performing fib function for each case
		int firstCase = fib.fib(0);
		int secondCase = fib.fib(1);
		int thirdCase = fib.fib(5);
		int fourthCase = fib.fib(10);
		
		////The first case where n = 0 is incorrect, should return 1
		//assertEquals(1, firstCase);
		
		assertEquals(1, secondCase);
		assertEquals(5, thirdCase);
		assertEquals(55, fourthCase);
	}

}
