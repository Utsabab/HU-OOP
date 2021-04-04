package org.howard.edu.lsp.assignment6.integerset;

import java.util.ArrayList;

/**
 * The Main class has main method which invokes methods from the IntegerSet class.
 * 
 * @author Utsab Khakurel
 * @version 1.0
 * @since 2021-03-04
 */
public class Main {
	/**
	 * This is the main method which makes use of all the methods from IntegerSet class located in implementation package.
	 * 
	 * @param args Unused
	 */
	public static void main(String[] args){
//		ArrayList<Integer> SetA = new ArrayList<Integer>();
//		SetA.add(1);
//		SetA.add(2);
//		SetA.add(3);
//		SetA.add(6);
//		
//		ArrayList<Integer> SetB = new ArrayList<Integer>();
//		SetB.add(1);
//		SetB.add(2);
//		SetB.add(6);
//		SetB.add(7);
		IntegerSet Set1 = new IntegerSet();
		IntegerSet Set2 = new IntegerSet();
		Set1.add(1);
		Set1.add(2);
		Set1.add(3);
		Set1.add(6);
		Set1.toString();
		
		String initialSet1 = Set1.toString();
		System.out.println("Initial Set1 looks like: " + initialSet1);
		
		String initialSet2 = Set2.toString();
		System.out.println("Initial Set2 looks like: " + initialSet2);
		System.out.println("");
		
		boolean contain1 = Set1.contains(1);
		System.out.println("Does Set1 contain 1" + "? " + contain1);
		
		boolean contain2 = Set1.contains(2);
		System.out.println("Does Set1 contain 2" + "? " + contain2);
		
		boolean contain3 = Set1.contains(9);
		System.out.println("Does Set1 contain 9" + "? " + contain3);
		System.out.println("");
		
		Set1.add(1);
		Set1.add(6);
		Set1.add(9);
		System.out.println("Set1 after adding 1,2 and 9 in Set1: " + Set1.toString());
		
		Set1.remove(9);
		Set1.remove(8);
		System.out.println("Set1 after removing 9 and 8 from Set1: " + Set1.toString());
		System.out.println("");
		
		int l = Set1.length();
		System.out.println("The length of Set1: " + l);
		System.out.println("");
		
		boolean check = Set1.equals(Set2);
		System.out.println("Are Set1 and Set2 equal? " + check);
		System.out.println("");
		
		try {
			int largest = Set1.largest();
			System.out.println("The largest value in Set1: " + largest);
		}
		catch (Exception ex) {
			System.out.println("The largest value in Set1: " + ex);
		}
		
		try {
			int smallest = Set1.smallest();
			System.out.println("The smallest value in Set1: " + smallest);
		}
		catch (Exception ex) {
			System.out.println("The smallest value in Set1: " + ex);
		}
		System.out.println("");
		
		Set1.remove(1);
		Set1.remove(2);
		Set1.remove(3);
		Set1.remove(6);
		
		System.out.println("After removing all the elements from Set1.");
		System.out.println("Is Set1 empty? " + Set1.isEmpty());
		System.out.println("");
		
		try {
			int largest = Set1.largest();
			System.out.println("The largest value in Set1: " + largest);
		}
		catch (Exception ex) {
			System.out.println("The largest value in Set1: " + ex);
		}
		
		try {
			int smallest = Set1.smallest();
			System.out.println("The smallest value in Set1: " + smallest);
		}
		catch (Exception ex) {
			System.out.println("The smallest value in Set1: " + ex);
		}
		System.out.println("");
		
		Set1.add(1);
		Set1.add(2);
		Set1.add(3);
		Set1.add(6);
		Set1.add(9);
		Set2.remove(1);
		System.out.println("Afer adding elements, Set1 looks like: " + Set1.toString());
		System.out.println("Afer removing elements, Set2 looks like: " + Set2.toString());
		System.out.println("");
		
		Set1.union(Set2);
		System.out.println("The union of Set1 and Set2: " + Set1.toString());
		System.out.println("");
		
		Set1.intersect(Set2);
		System.out.println("The intersect of Set1 and Set2: " + Set1.toString());
		System.out.println("");
		
		
		Set1.diff(Set2);
		if (Set1.isEmpty()) {
			System.out.println("The difference of Set1 and Set2 is empty.");
		}
		else {
			System.out.println("The difference of Set1 and Set2: " + Set1.toString());
		}
		System.out.println("");
		
		Set1.add(1);
		Set1.add(5);
		Set1.add(6);
		Set1.add(3);
		Set2.add(5);
		System.out.println("Afer adding elements, Set1 looks like: " + Set1.toString());
		System.out.println("Afer adding elements, Set2 looks like: " + Set2.toString());
		System.out.println("");
		
		Set1.diff(Set2);
		if (Set1.isEmpty()) {
			System.out.println("The difference of Set1 and Set2 is empty.");
		}
		else {
			System.out.println("The difference of Set1 and Set2: " + Set1.toString());
		}
		System.out.println("");
		
		String ans = Set1.toString();
		System.out.println("The final Set1 looks like: " + ans);
		System.out.println("");
		
		Set1.clear();
		System.out.println("After clearing Set1.");
		System.out.println("Is Set1 empty? " + Set1.isEmpty());
		System.out.println("");
	}
	
}
