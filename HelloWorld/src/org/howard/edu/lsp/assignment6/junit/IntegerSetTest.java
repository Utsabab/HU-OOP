package org.howard.edu.lsp.assignment6.junit;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class IntegerSetTest {
	@Test
	public void testAdd() {
		IntegerSet intsettest= new IntegerSet();
		intsettest.add(1);
		intsettest.add(2);
		intsettest.add(3);
		intsettest.add(6);
		String expectedValue = intsettest.toString();
		String receivingValue = "1236";
		assertEquals(expectedValue, receivingValue);
	}
	
//	@Test
//	public void testClear() {
//		 IntegerSet intsettest= new IntegerSet();
//	}
	
}
