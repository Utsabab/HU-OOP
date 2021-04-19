package org.howard.edu.lsp.assignment7.tollbooth;
/**
 * 
 * @author Utsab
 *
 */
public interface TollBooth {
	public int calculateToll(Truck truck);
	public void reset();
	public void displayData();
	public int trucksCollection();
	public int receiptsCollection();
}

