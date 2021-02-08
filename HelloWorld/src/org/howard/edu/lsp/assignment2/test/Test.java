package org.howard.edu.lsp.assignment2.test;
import org.howard.edu.lsp.assignment2.combination.Combination;
import java.util.*;

public class Test{
	public static void main(String[] args){
		Combination comb = new Combination();
		
		
		ArrayList<int[]> arr = comb.findCombinations();
		
		System.out.println("The combination sets are: ");
		
		for(int i=0; i<arr.size(); i++) {
			int[] temp = arr.get(i);
			System.out.print("[");
			for(int j=0; j<temp.length; j++) {
				if (j == temp.length - 1) {
					System.out.println(temp[j] + "]");
				}
				else {
					System.out.print(temp[j] + ", ");
				}
			}	
		}
	}
}
