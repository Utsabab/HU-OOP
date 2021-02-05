package org.howard.edu.lsp.assignment2.test;
import org.howard.edu.lsp.assignment2.combination.combination;
import java.util.*;

public class test{
	public static void main(String[] args){
		System.out.println("Yup this is it");
		
		combination comb = new combination();
		int[] inpt = new int[]{1,2,3,4,5,6};
		ArrayList<int[]> arr = comb.findCombinations(inpt, 6);
		for(int i=0; i<arr.size(); i++) {
			int[] temp = arr.get(i);
			System.out.println("Hey Nope this is it");
			for(int j=0; j<temp.length; j++) {
				System.out.println(temp[j]);
			}	
		}
	}
}
