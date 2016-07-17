package com.codelab;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EratosthenesTest.class, EuclidTest.class, FibonacciTest.class, HornerTest.class, LottoTest.class,
		TriangleTest.class })
public class AllTests {

}
