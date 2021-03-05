package org.howard.edu.lsp.assignment4.implementation;
import java.util.*;

public class IntegerSet {
	public ArrayList<Integer> set;
	public IntegerSet(ArrayList<Integer> newset) {
		 set = newset;
	}
	
	public void clear() {
		set = new ArrayList<Integer>();
	}
	
	public int length() {
		int l = 0;
		for (int i=0; i<set.size(); i++) {
			l = l + 1;
		}
		return l;
	}
	
	public boolean equals(IntegerSet b) {
		Collections.sort(set);
		Collections.sort(b.set);
		boolean isEqual = set.equals(b.set);
		return isEqual;
	}
	
	public boolean contains(int value) {
		for (int i=0;i<set.size();i++) {
			if (set.get(i).intValue() == value) {
				return true;
			}
		}
		return false;
	}
	
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
	
	public void add(int item) {
		if(!set.contains(item)) {
			set.add(item);
		}
	}
	
	public void remove(int item) {
		if (set.contains(item)) {
			int ind = set.indexOf(item);
			set.remove(ind);
		}
	}
	
	public void union(IntegerSet intSetb) {
		ArrayList<Integer> Setb = intSetb.set; 
		for(int i=0;i<Setb.size();i++) {
			if (!set.contains(Setb.get(i))) {
				set.add(Setb.get(i));
			}
		}
	}
	
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
	
	public void intSetdiff(IntegerSet intSetb) {
		ArrayList<Integer> Setb = intSetb.set;
		set.removeAll(Setb);
	}
	
	public boolean isEmpty() {
		if (set.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String ans = "";
		for(int i=0;i<set.size();i++) {
			ans = ans + set.get(i);
		}
		return ans;
	}
}

