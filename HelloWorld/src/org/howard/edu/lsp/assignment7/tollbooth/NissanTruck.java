package org.howard.edu.lsp.assignment7.tollbooth;

public class NissanTruck implements Truck {
	private int axles;
	private int totalWeight;
	
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