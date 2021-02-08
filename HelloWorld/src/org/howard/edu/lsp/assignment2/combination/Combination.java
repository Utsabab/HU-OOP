package org.howard.edu.lsp.assignment2.combination;
import java.util.*;

public class Combination {
	ArrayList<int[]> ans = new ArrayList<int[]>();
	
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
	
	public ArrayList<int []> findCombinations() {
		int[] inpt = new int[]{1,2,3,4,5,6};
		int target = 6;
		
		int[] curr = new int[]{};
		combos(curr,inpt,0, target);
		
		return(ans);
	}
}
