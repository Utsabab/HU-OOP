package org.howard.edu.lsp.assignment7.tollbooth;

/**
* The class FordTruck implements interface Truck.
* The class has implementations of each method defined in interface Truck.
* 
* @author Utsab Khakurel
* @version 1.0
* @since 2021-04-19
*/

public class FordTruck implements Truck {
	private int axles;
	private int totalWeight;
	
	/**
	* Constructor for class FordTruck.
	* 
	* @param axles The int value defining number of axles in truck
	* @param totalWeight The int value defining total weight of the truck
	*/
	public FordTruck(int axles, int totalWeight) {
        this.axles = axles;
        this.totalWeight = totalWeight;
	}
	
	/**
	* This function returns number of axles of truck.
	* 
	* @return The int value of number of axles
	*/
	public int getAxles() {
		return axles;
	}
	
	/**
	* This function returns total weight of truck.
	* 
	* @return The int value of number of axles
	*/
	public int getTotalWeight() {
		return totalWeight;
    }
}