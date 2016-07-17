package com.codelab;

import static org.junit.Assert.*;

import org.junit.Test;

public class EratosthenesTest {

	@Test
	public void test() throws Exception {
		
		Eratosthenes era = new Eratosthenes();
		
		int[] test1 = era.primes(3);
		int[] test2 = era.primes(39);
		int[] test3 = era.primes(2);
		
		//Count variable used to increment when a prime number is found
		int count = 0;
		int count2 = 0;
		int count3 = 0;
		
		//For loops checks array for numbers that aren't 0
		for(int i = 0; i < test1.length; i++) {
			if(test1[i] != 0){
				count++;
			}
		}
		
		for(int i = 0; i < test2.length; i++) {
			if(test2[i]!= 0){
				count2++;
			}
		}
		
		for(int i = 0; i < test3.length; i++){
			if(test3[i] != 0)
			count3++;
		}
		
		assertEquals(2, count);
		assertEquals(12, count2);
		assertEquals(1, count3);

	}
}
