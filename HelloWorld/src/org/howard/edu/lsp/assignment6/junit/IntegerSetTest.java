package org.howard.edu.lsp.assignment6.junit;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerSetTest {
	@Test
	public void testClear() {
		IntegerSet testset = new IntegerSet();
		testset.add(1);
		testset.add(5);
		testset.clear();
		testset.clear();
		String expectedValue = "";
		String receivingValue = testset.toString();
		assertEquals(expectedValue, receivingValue);
	}
	
	@Test
	public void testLength() {
		IntegerSet testset = new IntegerSet();
		testset.add(4);
		testset.add(6);
		testset.add(9);
		int expectedValue = 3;
		int receivingValue = testset.length();
		assertEquals(expectedValue, receivingValue);
	}
	
	@Test
	public void testEquals() {
		IntegerSet testsetA = new IntegerSet();
		testsetA.add(1);
		testsetA.add(6);
		testsetA.add(9);
		
		IntegerSet testsetB = new IntegerSet();
		testsetB.add(9);
		testsetB.add(1);
		testsetB.add(6);
		
		boolean expectedValue = true;
		boolean receivingValue = testsetA.equals(testsetB);
		assertEquals(expectedValue, receivingValue);		
	}
	
	@Test
	public void testContains() {
		IntegerSet testset = new IntegerSet();
		testset.add(7);
		testset.add(9);
		testset.add(10);
		testset.add(6);
		testset.remove(7);
		
		boolean expectedValue = true;
		boolean receivingValue = testset.contains(10);
		assertEquals(expectedValue, receivingValue);
	}
	
	@Test
	public void testLargest() {
		IntegerSet testset = new IntegerSet();
		testset.add(5);
		testset.add(15);
		testset.add(1);
		testset.add(6);
		testset.remove(6);
		
		try {
			int receivingValue = testset.largest();
			int expectedValue = 15;
			assertEquals(expectedValue, receivingValue);
		}
		catch (Exception e){
			assertThrows(Exception.class, () -> testset.largest());
			assertEquals("The ArrayList is empty!", e.getMessage());
		}
	}
	
	@Test
	public void testLargestException() {
		IntegerSet testset = new IntegerSet();
		
		try {
			int largest = testset.largest();
		}
		catch (Exception e){
			assertThrows(Exception.class, () -> testset.largest());
			assertEquals("The ArrayList is empty!", e.getMessage());
		}
	}
	
	@Test
	public void testSmallest() {
		IntegerSet testset = new IntegerSet();
		testset.add(5);
		testset.add(15);
		testset.add(1);
		testset.add(6);
		testset.remove(6);
		
		try {
			int receivingValue = testset.smallest();
			int expectedValue = 1;
			assertEquals(expectedValue, receivingValue);
		}
		catch (Exception e){
			assertThrows(Exception.class, () -> testset.smallest());
			assertEquals("The ArrayList is empty!", e.getMessage());
		}
	}
	
	@Test
	public void testSmallestException() {
		IntegerSet testset = new IntegerSet();
		
		try {
			int smallest = testset.smallest();
		}
		catch (Exception e){
			assertThrows(Exception.class, () -> testset.smallest());
			assertEquals("The ArrayList is empty!", e.getMessage());
		}
	}
	
	@Test
	public void testAdd() {
		IntegerSet intsettest= new IntegerSet();
		intsettest.add(1);
		intsettest.add(2);
		intsettest.add(3);
		intsettest.add(6);
		String expectedValue = "1236";
		String receivingValue = intsettest.toString();
		assertEquals(expectedValue, receivingValue);
	}
	
//	@Test
//	public void testClear() {
//		 IntegerSet intsettest= new IntegerSet();
//	}
	
}
