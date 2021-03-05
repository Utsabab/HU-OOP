package org.howard.edu.lsp.assignment4.implementation;
import java.util.*;

/**
 * The IntegerSet class initializes private ArrayList set.
 * IntegerSet class has methods add, remove, contains, length, equals, largest, smallest, union, intersection, difference, clear, isEmpty, and toString.
 * The methods in the class implements the characteristics of set in the ArrayList set.
 * 
 * @author Utsab Khakurel
 * @version 1.0
 * @since 2021-03-04
 * @see ArrayList
 */

public class IntegerSet {
	//Private variable set of type ArrayList which behaves like set.
	private ArrayList<Integer> set;
	
	/**
	 * Initializes set with the newset sent as a parameter.
	 * 
	 * @param newset 	The ArrayList sent through the main function
	 */
	public IntegerSet(ArrayList<Integer> newset) {
		 set = newset; 	
	}
	
	/**
	 * This method clears the set and initializes it with empty ArrayList.
	 */
	public void clear() {
		set = new ArrayList<Integer>();
	}
	
	/**
	 * This method loops through the ArrayList set and returns the length of the set.
	 * 
	 * @return	The int value signifying the length of the set
	 */
	public int length() {
		int l = 0;
		for (int i=0; i<set.size(); i++) {
			l = l + 1;
		}
		return l;
	}
	
	/**
	 * This method checks if the Integer values in the set of IntegerSet type object parameter are same as the Integer values in the set of this class or not.  
	 * 
	 * @param b	The IntegerSet object containing the ArrayList which behaves like set
	 * @return	This returns the boolean value true if sets are equal else false
	 */
	public boolean equals(IntegerSet b) {
		Collections.sort(set);
		Collections.sort(b.set);
		boolean isEqual = set.equals(b.set);
		return isEqual;
	}
	
	/**
	 * This method checks if the parameter value is in the set of this class or not.
	 * 
	 * @param value	The int type parameter to be checked if it is in the set
	 * @return	This returns boolean value true if value is in the set else false
	 */
	public boolean contains(int value) {
		for (int i=0;i<set.size();i++) {
			if (set.get(i).intValue() == value) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * This method finds the largest value in the set. If the set is empty, it throws the IntegerSetException.
	 * 
	 * @return	The int value which is the largest item in the set
	 * @throws IntegerSetException	If the set is empty, throws this exception
	 */
	public int largest() throws IntegerSetException {
		
		if (set.isEmpty()) {
			throw new IntegerSetException("The ArrayList is empty!");
		}
		
		int largest = Integer.MIN_VALUE;
		
		for (int i=0;i<set.size();i++) {
			if (largest < set.get(i)) {
				largest = set.get(i); 
			}
		}
		return largest;
	}
			
	/**
	 * This method finds the smallest value in the set. If the set is empty, it throws the IntegerSetException.
	 * 
	 * @return	The int value which is the smallest item in the set
	 * @throws IntegerSetException	If the set is empty, throws this exception
	 */
	public int smallest() throws IntegerSetException {
		if (set.isEmpty()) {
			throw new IntegerSetException("The ArrayList is empty!");
		}
		
		int smallest = Integer.MAX_VALUE;
		
		for (int i=0;i<set.size();i++) {
			if (smallest > set.get(i)) {
				smallest = set.get(i); 
			}
		}
		return smallest;
	}
	
	/**
	 * This method adds the int value item to the set, if the item doesn't exist in the set already.
	 * 
	 * @param item	The int value parameter to be added into the set
	 */
	public void add(int item) {
		if(!set.contains(item)) {
			set.add(item);
		}
	}
	
	/**
	 * This method removes the int value item from the set, if the item exists in the set.
	 * 
	 * @param item	The int value parameter to be removed from the set
	 */
	public void remove(int item) {
		if (set.contains(item)) {
			int ind = set.indexOf(item);
			set.remove(ind);
		}
	}
	
	/**
	 * This method initializes the set of this class with all the elements combined from the set of the IntergerSet object parameter with the set of this class. 
	 * 
	 * @param intSetb	The IntegerSet type object containing the set and Integer values in it
	 */
	public void union(IntegerSet intSetb) {
		ArrayList<Integer> Setb = intSetb.set; 
		for(int i=0;i<Setb.size();i++) {
			if (!set.contains(Setb.get(i))) {
				set.add(Setb.get(i));
			}
		}
	}
	
	/**
	 * This method initializes the set of this class with all the elements common between the set of the IntergerSet object parameter and the set of this class. 
	 * 
	 * @param intSetb	The IntegerSet type object containing the set and the Integer values in it
	 */
	public void intSetintersect(IntegerSet intSetb) {
		ArrayList<Integer> Setb = intSetb.set;
		int i = 0;
		while (i < set.size()) {
			int element = set.get(i);
			if (!Setb.contains(element)) {
				int ind = set.indexOf(element);
				set.remove(ind);
			}
			else {
				i = i + 1;
			}
		}
	}
	
	/**
	 * This method initializes the set of this class with all the elements that are only present in the set of this class and not in the set of the IntegerSet object parameter.
	 *  
	 * @param intSetb	The IntegerSet type object containing the set and the Integer values in it
	 */
	public void intSetdiff(IntegerSet intSetb) {
		ArrayList<Integer> Setb = intSetb.set;
		set.removeAll(Setb);
	}
	
	/**
	 * This method checks if the set is empty or not.
	 * 
	 * @return	This returns the boolean value true if the set is empty else false
	 */
	public boolean isEmpty() {
		if (set.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * This method converts all the elements in the set into the string and returns the string.
	 * 
	 * @return	This returns the string version of the elements from the set
	 */
	public String toString() {
		String ans = "";
		for(int i=0;i<set.size();i++) {
			ans = ans + set.get(i);
		}
		return ans;
	}
}

