package org.howard.edu.lsp.assignment2.test;
import org.howard.edu.lsp.assignment2.combination.Implementation;

/**
 * The Main class has main method which invokes method from the Implementation class.
 * 
 * @author Utsab Khakurel
 * @version 1.0
 * @since 2021-02-07
 */
public class Main{
	/**
	 * 
	 * This is the main method which makes use of findCombinations method from Implementation class located in combination package.
	 * @param args Unused.
	 * @return Nothing.
	 * 
	 */
	public static void main(String[] args){
		Implementation comb = new Implementation();
		comb.findCombinations();
	}
}
