package org.howard.edu.lsp.exam.question41;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

/**
* The TestRemove class contains test methods from the Remove class implementations.
* 
* @author Utsab Khakurel
* @version 1.0
* @since 2021-04-22
*/
class TestRemove {

	/**
	 * Checks if method removeZeros in Remove class is displaying correct output or not.
	 * Checks the received and expected integer value to confirm the function works properly.
	 */
	@Test
	@DisplayName("Test cases for removeZeros")
	void testRemoveZeros() {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, 7, 2, 0, 0, 4, 8, 8));
		Remove newinstance = new Remove();
		newinstance.removeZeros(numbers);
		String receivingValue = newinstance.toString(numbers);
		String expectedValue = "72488";
		assertEquals(expectedValue, receivingValue);
	}

}
