package org.howard.edu.lsp.assignment6.junit;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;

/**
 * The IntegerSetTest class contains test methods for all the methods from the IntergerSet implementation.
 * 
 * @author Utsab Khakurel
 * @version 1.0
 * @since 2021-04-04
 */

public class IntegerSetTest {
	/**
	 * Checks if the clear method initializes the ArrayList set to empty or not.
	 * Checks the edge case calling clear method in an empty set.
	 * Checks the received and expected string value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for clear")
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
	
	/**
	 * Checks if the length method returns the length of the set.
	 * Checks the received and expected integer value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for length")
	public void testLength() {
		IntegerSet testset = new IntegerSet();
		testset.add(4);
		testset.add(6);
		testset.add(9);
		int expectedValue = 3;
		int receivingValue = testset.length();
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	 * Checks if the method equals does compare two sets to be equal or not, no matter the order of the elements in the set.
	 * Checks the received and expected boolean value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for equals")
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
	
	/**
	 * Checks if the method contains looks for the given element in the set.
	 * Checks the received and expected boolean value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for contains")
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
	
	/**
	 * Checks if the method largest returns the largest integer in the set or not.
	 * Checks the received and expected integer value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for largest")
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
	
	/**
	 * Checks if the method largest returns exception in the case of empty set or not.
	 * Checks the received and expected string value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for largest")
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
	
	/**
	 * Checks if the method smallest returns the smallest integer in the set or not.
	 * Checks the received and expected integer value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for smallest")
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
	
	/**
	 * Checks if the method smallest returns exception in the case of empty set or not.
	 * Checks the received and expected string value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for smallest")
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
	
	/**
	 * Checks if the add method adds value to the set, testing the edge case by adding duplicate elements.
	 * Checks the received and expected string value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for add")
	public void testAdd() {
		IntegerSet testset= new IntegerSet();
		testset.add(1);
		testset.add(2);
		testset.add(6);
		testset.add(3);
		testset.add(6);
		testset.add(1);
		
		String expectedValue = "1263";
		String receivingValue = testset.toString();
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	 * Checks if the remove method removes value from the set, testing the edge case when the set is empty. 
	 * Checks the received and expected string value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for remove")
	public void testRemove() {
		IntegerSet testset= new IntegerSet();
		testset.remove(1);
		testset.remove(19);
		testset.add(5);
		testset.add(11);
		testset.add(4);
		testset.add(18);
		testset.add(1);
		testset.remove(4);
		testset.remove(11);
		
		String expectedValue = "5181";
		String receivingValue = testset.toString();
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	 * Checks if the method union joins all the elements from two different sets, disregarding the duplicate elements.
	 * Checks the received and expected string value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for union")
	public void testUnion() {
		IntegerSet testsetA = new IntegerSet();
		testsetA.add(1);
		testsetA.add(6);
		testsetA.add(9);
		
		IntegerSet testsetB = new IntegerSet();
		testsetB.add(2);
		testsetB.add(3);
		testsetB.add(6);
		testsetB.add(7);
		testsetB.remove(2);
		
		testsetA.union(testsetB);
		
		String expectedValue = "16937";
		String receivingValue = testsetA.toString();
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	 * Checks if the method intersect joins only the elements existing in both the sets.
	 * Checks the received and expected string value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for intersect")
	public void testIntersect() {
		IntegerSet testsetA = new IntegerSet();
		testsetA.add(1);
		testsetA.add(6);
		testsetA.add(9);
		
		IntegerSet testsetB = new IntegerSet();
		testsetB.add(1);
		testsetB.add(3);
		testsetB.add(6);
		testsetB.add(9);
		testsetB.remove(1);
		
		testsetA.intersect(testsetB);
		
		String expectedValue = "69";
		String receivingValue = testsetA.toString();
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	 * Checks if the method diff deletes all the elements from the first set which exists in the second set. 
	 * Checks the received and expected string value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for diff")
	public void testDiff() {
		IntegerSet testsetA = new IntegerSet();
		testsetA.add(5);
		testsetA.add(6);
		testsetA.add(10);
		testsetA.add(12);
		testsetA.add(19);
		testsetA.add(23);
		
		IntegerSet testsetB = new IntegerSet();
		testsetB.add(1);
		testsetB.add(5);
		testsetB.add(6);
		testsetB.add(3);
		testsetB.add(19);
		testsetB.remove(1);
		
		testsetA.diff(testsetB);
		
		String expectedValue = "101223";
		String receivingValue = testsetA.toString();
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	 * Checks if the method isEmpty identifies if the set is empty or not.
	 * Checks the received and expected boolean value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for isEmpty")
	public void testIsEmpty() {
		IntegerSet testset = new IntegerSet();
		
		boolean expectedValue = true;
		boolean receivingValue = testset.isEmpty();
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	 * Checks if the method toString correctly converts the elements from the set into string.
	 * Checks the received and expected string value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for toString")
	public void testToString() {
		IntegerSet testset = new IntegerSet();
		testset.add(12);
		testset.add(6);
		testset.add(5);
		testset.add(7);
		testset.remove(1);
		testset.remove(5);
		
		String expectedValue = "1267";
		String receivingValue = testset.toString();
		assertEquals(expectedValue, receivingValue);
	}	
}
