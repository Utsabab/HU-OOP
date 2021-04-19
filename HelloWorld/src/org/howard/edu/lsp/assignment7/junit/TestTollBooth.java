package org.howard.edu.lsp.assignment7.junit;
import org.howard.edu.lsp.assignment7.tollbooth.AlleghenyTollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.TollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.FordTruck;
import org.howard.edu.lsp.assignment7.tollbooth.NissanTruck;
import org.howard.edu.lsp.assignment7.tollbooth.Truck;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

/**
* The TestTollBooth class contains test methods for all the methods from the TollBooth and Truck implementation.
* 
* @author Utsab Khakurel
* @version 1.0
* @since 2021-04-19
*/
public class TestTollBooth {
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
	* Checks if the getAxles returns the correct number of axles for the truck or not for FordTruck type truck.
	* Checks the received and expected integer value to confirm the function works properly.
	*/
	@Test
	void testGetAxlesFordTruck() {
		Truck ford = new FordTruck(11, 12000);
		int receivingValue = ford.getAxles();
		int expectedValue = 11;
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	* Checks if the getAxles returns the correct total weight of the truck or not for FordTruck type truck.
	* Checks the received and expected integer value to confirm the function works properly.
	*/
	@Test
	void testGetTotalWeightFordTruck() {
		Truck ford = new FordTruck(11, 12000);
		int receivingValue = ford.getTotalWeight();
		int expectedValue = 12000;
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	* Checks if the getAxles returns the correct number of axles for the truck or not for NissanTruck type truck.
	* Checks the received and expected integer value to confirm the function works properly.
	*/
	@Test
	void testGetAxlesNissanTruck() {
		Truck nissan = new NissanTruck(3, 4500);
		int receivingValue = nissan.getAxles();
		int expectedValue = 3;
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	* Checks if the getAxles returns the correct total weight of the truck or not for NissanTruck type truck.
	* Checks the received and expected integer value to confirm the function works properly.
	*/
	@Test
	void testGetTotalWeightNissanTruck() {
		Truck nissan = new NissanTruck(3, 4500);
		int receivingValue = nissan.getTotalWeight();
		int expectedValue = 4500;
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	* Checks if the total toll calculated for the given truck is correct or not.
	* Checks the received and expected integer value to confirm the function works properly.
	*/
	@Test
	void testCalcualteToll() {
		TollBooth booth = new AlleghenyTollBooth();
		Truck ford = new FordTruck(5, 12500); 	
		int receivingValue = booth.calculateToll(ford);
		int expectedValue = 145;
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	* Checks if the counter variable for truck is set to 0 or not.
	* Checks the received and expected integer value to confirm the function works properly.
	*/
	@Test
	void testResetTrucksSinceCollection() {
		TollBooth booth = new AlleghenyTollBooth();
		Truck nissan = new NissanTruck(4, 9000);
		booth.calculateToll(nissan);
		Truck ford = new NissanTruck(2, 5000);
		booth.calculateToll(ford);
		booth.reset();
		int receivingValue = booth.trucksCollection();
		int expectedValue = 0;
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	* Checks if the counter variable for total receipt is set to 0 or not.
	* Checks the received and expected integer value to confirm the function works properly.
	*/
	@Test
	void testResetReceiptsSinceCollection() {
		TollBooth booth = new AlleghenyTollBooth();
		Truck nissan = new NissanTruck(4, 9000);
		booth.calculateToll(nissan);
		Truck ford = new NissanTruck(2, 5000);
		booth.calculateToll(ford);
		booth.reset();
		int receivingValue = booth.receiptsCollection();
		int expectedValue = 0;
		assertEquals(expectedValue, receivingValue);
	}
	
	/**
	* Checks if the method displayData is displaying correct output or not.
	* Checks the received and expected integer value to confirm the function works properly.
	*/
	@Test
	void testDisplayData() {
		TollBooth booth = new AlleghenyTollBooth();
		Truck nissan = new NissanTruck(4, 9000);
		booth.calculateToll(nissan);
		Truck ford = new FordTruck(2, 12500);
		booth.calculateToll(ford);
		Truck nissanA = new NissanTruck(3, 5000);
		booth.calculateToll(nissanA);
		booth.displayData();
		String receivingValue = outputStreamCaptor.toString().trim();
		String expectedValue = "*** Collecting receipts *** Totals since last collection - Receipts: 305 Trucks: 3";
		assertEquals(expectedValue, receivingValue);
	}
}
