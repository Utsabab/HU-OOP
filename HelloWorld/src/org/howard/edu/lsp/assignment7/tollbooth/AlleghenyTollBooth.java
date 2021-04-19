package org.howard.edu.lsp.assignment7.tollbooth;

public class AlleghenyTollBooth implements TollBooth {
	private int receiptsSinceCollection;
	private int trucksSinceCollection;
	private int tollDue;
	
	public AlleghenyTollBooth() {
		trucksSinceCollection = 0;
		receiptsSinceCollection = 0;
	}
	
	public int calculateToll(Truck truck) {
		int axles = truck.getAxles();
		int totalWeight = truck.getTotalWeight();
		tollDue = 5*axles + 10*(totalWeight/1000);
        trucksSinceCollection = trucksSinceCollection + 1;
        receiptsSinceCollection = receiptsSinceCollection + tollDue;
        return tollDue;
	}
	
	public void reset() {
        displayData();
        trucksSinceCollection = 0;     
        receiptsSinceCollection = 0;
	}
	
	public int trucksCollection() {
		return trucksSinceCollection;
	}
	
	public int receiptsCollection() {
		return receiptsSinceCollection;
	}
	
	public void displayData() {
		System.out.print("*** Collecting receipts *** ");
		System.out.print("Totals since last collection - Receipts: ");
        System.out.print(receiptsSinceCollection);
        System.out.print(" Trucks: ");
        System.out.println(trucksSinceCollection);
	}
	
	
}