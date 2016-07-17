package com.codelab;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void test() {
		
		Triangle triangle = new Triangle(1, 1, 3);
		int n = triangle.classify();
		assertEquals(-1, n);
		
		Triangle triangle2 = new Triangle(1, 1, 2);
		int m = triangle2.classify();
		assertEquals(2, m);
		
		Triangle triangle3 = new Triangle(2, 3, 4);
		int o = triangle3.classify();
		assertEquals(3, o);
	}

}
