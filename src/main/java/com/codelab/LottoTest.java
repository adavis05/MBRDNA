package com.codelab;

import static org.junit.Assert.*;

import org.junit.Test;

public class LottoTest {

	@Test
	public void test() {
		
		long[] testArray = {100000, 8267, 99999, 34543, 56325, 345324};
		Lotto lotto = new Lotto(4562000, 5467500, 9670000, testArray);
		
		long test = lotto.getNumber(5);
		String testDate = "5/26/908";
		
		assertEquals(24, test);
		assertEquals("5/26/908", testDate);
		
		///////////////////////////////////
		long[] testArray2 = {345213, 345266, 567478, 456032, 675742, 803455};;
		Lotto lotto2 = new Lotto(4562000, 5467500, 9670000, testArray2);
		
		long test2 = lotto2.getNumber(3);
		String testDate2 = lotto2.getDate();
		
		assertEquals(51, test2);
		assertEquals("6/26/728", testDate2);
		
	}

}
