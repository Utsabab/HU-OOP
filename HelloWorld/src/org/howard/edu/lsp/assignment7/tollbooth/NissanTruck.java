package org.howard.edu.lsp.assignment7.tollbooth;

public class NissanTruck implements Truck {
	int axles;
	int totalWeight;
	
	public NissanTruck(int axles, int totalWeight) {
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