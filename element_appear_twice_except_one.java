/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example :

Input : [1 2 2 3 1]
Output : 3
*/

public class Solution {
	// DO NOT MODIFY THE LIST
	public int singleNumber(final List<Integer> a) {
	    
	    int result_xor=0;
	    
	    for(int i=0;i<a.size();i++){
	        result_xor = result_xor^a.get(i);
	    }
	    
	    return result_xor;
	}
}
