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
	
	@Test
	void testGetAxlesFordTruck() {
		Truck ford = new FordTruck(11, 12000);
		int receivingValue = ford.getAxles();
		int expectedValue = 11;
		assertEquals(expectedValue, receivingValue);
	}
	
	@Test
	void testGetTotalWeightFordTruck() {
		Truck ford = new FordTruck(11, 12000);
		int receivingValue = ford.getTotalWeight();
		int expectedValue = 12000;
		assertEquals(expectedValue, receivingValue);
	}
	
	@Test
	void testGetAxlesNissanTruck() {
		Truck nissan = new NissanTruck(3, 4500);
		int receivingValue = nissan.getAxles();
		int expectedValue = 3;
		assertEquals(expectedValue, receivingValue);
	}
	
	@Test
	void testGetTotalWeightNissanTruck() {
		Truck nissan = new NissanTruck(3, 4500);
		int receivingValue = nissan.getTotalWeight();
		int expectedValue = 4500;
		assertEquals(expectedValue, receivingValue);
	}
	
	@Test
	void testCalcualteToll() {
		TollBooth booth = new AlleghenyTollBooth();
		Truck ford = new FordTruck(5, 12500); 	
		int receivingValue = booth.calculateToll(ford);
		int expectedValue = 145;
		assertEquals(expectedValue, receivingValue);
	}
		
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
		assertEquals("*** Collecting receipts *** Totals since last collection - Receipts: 305 Trucks: 3", outputStreamCaptor.toString()
			      .trim());
	}
}
