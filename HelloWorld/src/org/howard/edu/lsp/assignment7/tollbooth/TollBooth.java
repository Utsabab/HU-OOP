package org.howard.edu.lsp.assignment7.tollbooth;

/**
* The interface TollBooth has defined methods for calculating toll, reseting display, 
* displaying data, and keeping track of count of trucks and receipts.
* 
* @author Utsab Khakurel
* @version 1.0
* @since 2021-04-19
*/

public interface TollBooth {
	public int calculateToll(Truck truck);
	public void reset();
	public void displayData();
	public int trucksCollection();
	public int receiptsCollection();
}

