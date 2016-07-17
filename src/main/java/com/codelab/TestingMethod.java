package com.codelab;

public class TestingMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*Eratosthenes era = new Eratosthenes();
		
		int []test = era.primes(10);
		
		for(int i = 0; i < test.length; i++)
			System.out.println(test[i]);*/	
		
		/////////////////////////////////////
		/*args = new String[10];
		
		args[0] = "2";
		args[1] = "3";
		

		args[2] = "2";
		args[3] = "3";
		args[4] = "1";
		//args[5] = "2";
		
		int test = Horner.solve(args);
		
		System.out.println(test);*/
		///////////////////////////////////////
		long[] test = {100000, 8267, 99999, 34543, 56325, 345324};
		long[] testArray2 = {345213, 345266, 567478, 456032, 675742, 803455};
		
		Lotto lotto = new Lotto(45620060, 54675500, 96700960, testArray2);
		
		
		
		long num = lotto.getNumber(3);
		String tester = lotto.getDate();
		
		long testNum = lotto.getNumber(3);
		
		System.out.println(tester);
		System.out.println(testNum);
		
		
	}

}
