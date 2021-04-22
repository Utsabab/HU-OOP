package org.howard.edu.lsp.exam.question40;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
* The TestAnimals class contains test methods from the Animals implementation.
* 
* @author Utsab Khakurel
* @version 1.0
* @since 2021-04-22
*/
public class TestAnimals {
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@BeforeEach
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@AfterEach
	public void tearDown() {
	    System.setOut(standardOut);
	}
	
	/**
	 * Checks if method fly in Goose class is displaying correct output or not.
	 * Checks the received and expected integer value to confirm the function works properly.
	 */
	@Test
	void testGooseFlying() {
		Goose flying = new Goose();
		flying.fly();	
		String receivingValue = outputStreamCaptor.toString().trim();
		String expectedValue = "This Goose flies";
		assertEquals(expectedValue, receivingValue);
	}

	/**
	 * Checks if method fly in Airplane class is displaying correct output or not.
	 * Checks the received and expected integer value to confirm the function works properly.
	 */
	@Test 
	void testAirplaneFlying() {
		Airplane flying = new Airplane();
		flying.fly();	
		String receivingValue = outputStreamCaptor.toString().trim();
		String expectedValue = "This Airplane flies";
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	 * Checks if method move in Tiger class is displaying correct output or not.
	 * Checks the received and expected integer value to confirm the function works properly.
	 */
	@Test
	void testTigermoves() {
		Tiger bengal = new Tiger();
		bengal.move();
		String receivingValue = outputStreamCaptor.toString().trim();
		String expectedValue = "This Tiger moves forward";
		assertEquals(expectedValue, receivingValue);
	}
}
