package org.howard.edu.lsp.assignment7.tollbooth;

public class FordTruck implements Truck {
	int axles;
	int totalWeight;
	
	public FordTruck(int axles, int totalWeight) {
        this.axles = axles;
        this.totalWeight = totalWeight;
	}
	
	public int getAxles() {
		return axles;
	}
	
    public int getTotalWeight() {
    	return totalWeight;
    }
}