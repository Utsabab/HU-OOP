package org.howard.edu.lsp.assignment7.tollbooth;

public class AlleghenyTollBooth implements TollBooth {
	int receiptsSinceCollection;
	int trucksSinceCollection;
	int tollDue;
	
	public AlleghenyTollBooth() {
		trucksSinceCollection = 0;
		receiptsSinceCollection = 0;
	}
	public int calculateToll(Truck truck) {
		int axles = truck.getAxles();
		int totalWeight = truck.getTotalWeight();
		int tollDue = 5*axles + 10*(totalWeight/1000);
		System.out.print("Truck arrival - axles: ");
		System.out.print(axles);
		System.out.print(" total weight: ");
        System.out.print(totalWeight);
        System.out.print(" Toll due: ");
        System.out.println(tollDue);
        trucksSinceCollection = trucksSinceCollection + 1;
        receiptsSinceCollection = receiptsSinceCollection + tollDue;
        return tollDue;
	}
	
	public void reset() {
		System.out.print("*** Collecting receipts ***");
        displayData();
        trucksSinceCollection = 0;     
        receiptsSinceCollection = 0;
	}
	public void displayData() {
		System.out.print("Totals since last collection - Receipts: ");
        System.out.print(receiptsSinceCollection);
        System.out.print(" Trucks: ");
        System.out.println(trucksSinceCollection);
	}
}