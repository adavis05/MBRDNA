package com.codelab;

import static org.junit.Assert.*;

import org.junit.Test;

public class HornerTest {

	@Test
	public void test() throws Exception {
	
		//String array can be any array
		String[]args = new String[10];
		
		args[0] = "3";
		args[1] = "4";
		args[2] = "3";
		args[3] = "4";
		args[4] = "3";
		args[5] = "4";
		
		//Second string
		String[] args2 = new String[10];
		
		args2[0] = "2";
		args2[1] = "3";
		

		args2[2] = "2";
		args2[3] = "3";
		args2[4] = "1";
				
		int test = Horner.solve(args);
		int test2 = Horner.solve(args2);
		
		assertEquals(323, test);		
		assertEquals(20, test2);
	}

}
