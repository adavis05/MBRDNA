package com.codelab;

import static org.junit.Assert.*;

import org.junit.Test;

public class EuclidTest {

	@Test
	public void test() throws Exception {
		
		Euclid euclid = new Euclid();
		
		int test1 = euclid.gcd(120, 65);
		int test2 = euclid.gcd(120, 66);
		
		assertEquals(5, test1);
		assertEquals(6, test2);
	}

}
