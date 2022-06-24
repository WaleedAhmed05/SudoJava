package l33tc0de;

/**
 * @author Waleed05
 * @description-
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * 
 */

import java.util.ArrayList;

public class TwoSums {
	
	
	    public static int[] twoSum(int[] nums, int target) {
	    	
	    	ArrayList<Integer> mylist = new ArrayList<Integer>();
	    	int[] result= new int[2];
	        
	        for(int i=0; i<nums.length; i++) {
	        	if(mylist.contains(target-nums[i])) {
	        		result[0]=i;
	        		result[1]=mylist.indexOf(target-nums[i]);
	        		break;}
	        	else
	        		mylist.add(nums[i]);
	        		
	        }
	        
	        return result;
	    }
	
	
	public static void main (String [] args) {
		
		int [] nums = {2,7,11,15};
		int target = ;
		int[] result = twoSum(nums, target);
		System.out.println(result[0]);
		System.out.println(result[1]);
		
	}

}
