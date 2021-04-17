package org.howard.edu.lsp.assignment7.junit;
import org.howard.edu.lsp.assignment7.tollbooth.AlleghenyTollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.TollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.FordTruck;
import org.howard.edu.lsp.assignment7.tollbooth.NissanTruck;
import org.howard.edu.lsp.assignment7.tollbooth.Truck;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class TestTollBooth {

	@Test
	void test() {
		TollBooth booth = new AlleghenyTollBooth();

		Truck ford = new FordTruck(5, 12000); 	// 5 axles and 12000 kilograms
		Truck nissan = new NissanTruck(2, 5000);
		
		int receivingValue = booth.calculateToll(ford);
		
		int expectedValue = 145;
		
		assertEquals(expectedValue, receivingValue);
		
//		booth.displayData();
//		booth.calculateToll(nissan);
//		booth.reset();	// zero out receipts, print out aforementioned summary information.
//		booth.displayData();
		
		
	}

}
