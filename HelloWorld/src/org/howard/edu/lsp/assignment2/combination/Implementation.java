package org.howard.edu.lsp.assignment2.combination;
import java.util.*;

public class Implementation {
	public static ArrayList<int[]> ans = new ArrayList<int[]>();
	
	public void combos(int[] curr, int[] inpt, int ind, int target) {
		int sum = 0;
		for(int i = 0; i < curr.length; i++) {
			sum += inpt[curr[i]];
		}
		
		if (curr.length != 0 && sum == target) {
			ans.add(curr);
		}
		
		for (int i = ind; i < inpt.length; i++) {
			curr = Arrays.copyOf(curr, curr.length + 1);
			curr[curr.length - 1] = i;
			combos(curr, inpt, i+1, target);
			curr = Arrays.copyOf(curr, curr.length - 1);
		}
	}
	
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
		
		int[] inpt5 = new int[]{3,-5,1,9,0,5,-2,-3};
		int target5 = 0;
		int[] curr5 = new int[]{};
		process(curr5,inpt5,0, target5);
		ans = new ArrayList<int[]>();
	}
}
