package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

/**
* This class provides method to remove zeros from the ArrayList.
* 
* @author Utsab Khakurel
* @version 1.0
* @since 2021-04-22
*/
public class Remove {
	/**
	 * This method provides an implementation to remove all the zeros from the ArrayList.
	 */
	public void removeZeros(ArrayList<Integer> intList) {
		for(int i = 0; i < intList.size(); i++) {
			if(intList.get(i) == 0) {
				intList.remove(i);
				i--;
			}
		}
	}
	
	/**
	 * This function converts the ArrayList into String for the test purpose.
	 */
	public String toString(ArrayList<Integer> intList) {
		String ans = "";
		for(int i=0;i<intList.size();i++) {
			ans = ans + intList.get(i);
		}
		return ans;
	}
}