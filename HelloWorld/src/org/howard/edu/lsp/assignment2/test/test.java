package org.howard.edu.lsp.assignment2.test;
import org.howard.edu.lsp.assignment2.combination.combination;
import java.util.*;

public class test{
	public static void main(String[] args){
		combination comb = new combination();
		int[] inpt = new int[]{5,5,15,10};
		ArrayList<int[]> arr = comb.findCombinations(inpt, 15);
		
		for(int i=0; i<arr.size(); i++) {
			int[] temp = arr.get(i);
			for(int j=0; j<temp.length; j++) {
				System.out.println(temp[j]);
			}	
		}
	}
}
