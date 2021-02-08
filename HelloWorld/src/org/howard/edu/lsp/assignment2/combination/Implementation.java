package org.howard.edu.lsp.assignment2.combination;
import java.util.*;

/**
 * The Implementation class initializes global ArrayList ans.
 * The program has three functions combos, process, and findCombinations.
 * The program looks for all possible combinations of integer from the input array which sums to target.
 * The program uses various possible test cases to generate the appropriate result and test the implementation.
 * 
 * @author Utsab Khakurel
 * @version 1.0
 * @since 2021-02-07
 * @see ArrayList
 * @see Array
 */

public class Implementation {
	//Global variable of type ArrayList to store all possible combinations for a given input.
	public static ArrayList<int[]> ans = new ArrayList<int[]>();
	
	/**
	 * This method uses backtracking algorithm to generate all possible combinations of integer values, and 
	 * recursively call itself to find the combination set which adds up to target value, append to the final ans, and 
	 * pop the element to find other combinations.
	 * 
	 * @param curr     The int array with possible combination which sums to target
	 * @param inpt     The int array as an input consisting of integer values
	 * @param ind      The int variable indicating which index to start from in the array inpt to form combination set
	 * @param target   The int variable indicating the target
	 */
	public void combos(int[] curr, int[] inpt, int ind, int target) {
		int sum = 0;
		//for loop to generate sum of array curr.
		for(int i = 0; i < curr.length; i++) {
			sum += inpt[curr[i]];
		}
		
		//If the curr is not empty and the sum is equals to target, add the array curr into ans.
		if (curr.length != 0 && sum == target) {
			ans.add(curr);
		}
		
		//for loop to append integer, and make recursive calls, and pop the element to generate all other possible permutations of the input array.
		for (int i = ind; i < inpt.length; i++) {
			curr = Arrays.copyOf(curr, curr.length + 1);
			curr[curr.length - 1] = i;
			combos(curr, inpt, i+1, target);
			curr = Arrays.copyOf(curr, curr.length - 1);
		}
	}
	
	/**
	 * This method simply takes in the arguments and calls the method combos for the results. 
	 * For each input array, this method generates the result, and prints the input array, target, and the result in the console in that order.
	 * 
	 * @param curr     The int array with possible combination which sums to target
	 * @param inpt     The int array as an input consisting of integer values
	 * @param ind      The int variable indicating which index to start from in the array inpt to form combination set
	 * @param target   The int variable indicating the target.
	 */
	public void process(int[] curr, int[] inpt, int ind, int target) {
		combos(curr,inpt,0, target);
	
		if (inpt.length == 0) {
			System.out.println("The input array is empty!");
			System.out.println('\n');
			return;
		}
		
		System.out.println("The input int array is: ");
		
		System.out.print("[");	
		for(int i=0; i<inpt.length; i++) {
			if (i == inpt.length - 1) {
				System.out.println(inpt[i] + "]");
			}
			else {
				System.out.print(inpt[i] + ", ");
			}
		}
		
		System.out.println("The target is: " + target);
		
		System.out.println("The combination sets are: ");
		for(int i=0; i<ans.size(); i++) {
			int[] temp = ans.get(i);
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
		System.out.println('\n');
	}
	
	/**
	 * This method creates various possible test cases to test the implementation in the method process and combos.
	 * Initiates input array, target value, temporary int array to hold possible combination, and invokes the method process.
	 * Initiates global ArrayList ans to empty after every test case.
	 */
	public void findCombinations() {
		int[] inpt2 = new int[]{1,2,3};
		int target2 = 2;
		int[] curr2 = new int[]{};
		process(curr2,inpt2,0, target2);
		ans = new ArrayList<int[]>();
		
		int[] inpt = new int[]{1,2,3,4,5,6};
		int target = 6;
		int[] curr = new int[]{};
		process(curr,inpt,0, target);
		ans = new ArrayList<int[]>();
		
		int[] inpt1 = new int[]{5,5,10,15};
		int target1 = 15;
		int[] curr1 = new int[]{};
		process(curr1,inpt1,0, target1);
		ans = new ArrayList<int[]>();
		
		int[] inpt6 = new int[]{5,2,2,5};
		int target6 = 7;
		int[] curr6 = new int[]{};
		process(curr6,inpt6,0, target6);
		ans = new ArrayList<int[]>();
		
		int[] inpt3 = new int[]{};
		int target3 = 2;
		int[] curr3 = new int[]{};
		process(curr3,inpt3,0, target3);
		ans = new ArrayList<int[]>();
		
		int[] inpt4 = new int[]{1,-2,3};
		int target4 = 1;
		int[] curr4 = new int[]{};
		process(curr4,inpt4,0, target4);
		ans = new ArrayList<int[]>();
		
		int[] inpt5 = new int[]{3,-5,1,9,0,5,-2,-3,-3};
		int target5 = 0;
		int[] curr5 = new int[]{};
		process(curr5,inpt5,0, target5);
		ans = new ArrayList<int[]>();
	}
}
