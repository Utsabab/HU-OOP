package org.howard.edu.lsp.assignment7.tollbooth;

/**
 * The class AlleghenyTollBooth implements interface TollBooth.
 * The class has implementations of each method defined in interface TollBooth.
 * 
 * @author Utsab Khakurel
 * @version 1.0
 * @since 2021-04-19
 */

public class AlleghenyTollBooth implements TollBooth {
	private int receiptsSinceCollection;
	private int trucksSinceCollection;
	private int tollDue;
	
	/**
	 * Constructor for class AlleghenyTollBooth.
	 */
	
	public AlleghenyTollBooth() {
		trucksSinceCollection = 0;
		receiptsSinceCollection = 0;
	}
	
	/**
	 * This method calculates the total toll for the given truck.
	 * 
	 * @param truck The Truck type object 
	 * @return This returns the total toll amount due for the given truck
	 */
	public int calculateToll(Truck truck) {
		int axles = truck.getAxles();
		int totalWeight = truck.getTotalWeight();
		tollDue = 5*axles + 10*(totalWeight/1000);
        trucksSinceCollection = trucksSinceCollection + 1;
        receiptsSinceCollection = receiptsSinceCollection + tollDue;
        return tollDue;
	}
	
	/**
	 * This method displays the total trucks and receipts collected after the previous reset function call.
	 * It initializes both truck and receipt tracking variable to 0.
	 */
	public void reset() {
        displayData();
        trucksSinceCollection = 0;     
        receiptsSinceCollection = 0;
	}
	
	/**
	 * This functions returns the count of truck accumulated since last reset function call.
	 * 
	 * @return The int value signifying total truck counts
	 */
	public int trucksCollection() {
		return trucksSinceCollection;
	}
	
	/**
	 * This function returns the total receipt amount accumulated since last reset function call.
	 * 
	 * @return The int value signifying total receipt amount
	 */
	public int receiptsCollection() {
		return receiptsSinceCollection;
	}
	
	/**
	 * This function outputs the total trucks and receipts accumulated since the last reset function call.
	 */
	public void displayData() {
		System.out.print("*** Collecting receipts *** ");
		System.out.print("Totals since last collection - Receipts: ");
        System.out.print(receiptsSinceCollection);
        System.out.print(" Trucks: ");
        System.out.println(trucksSinceCollection);
	}
	
	
}