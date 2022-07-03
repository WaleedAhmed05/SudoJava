package l33tc0de;


/**
 * @author Waleed05
 * @description-
 *Given an integer array nums and an integer val,
 *remove all occurrences of val in nums in-place.
 *The relative order of the elements may be changed.
 * 
 *Input: nums = [0,1,2,2,3,0,4,2], val = 2
 *Output: 5, nums = [0,1,4,0,3,_,_,_]
 *Explanation: Your function should return k = 5, with the first five elements of
 * nums containing 0, 0, 1, 3, and 4.
 *Note that the five elements can be returned in any order.
 *It does not matter what you leave beyond the returned k (hence they are underscores)
 * 
 */

public class RemoveElement {
	
	 public static int removeElement(int[] nums, int val) {
	        
	     int [] nums2=nums;
	     int counter=0;
	     int result=0;
		 for(int i=0; i<nums.length; i++){
	            if(nums[i]!=val) {
	            	nums2[counter]=nums[i];
	            	result++;
	            	counter++;
	            }
	                 
	        }
	        
	        return result;
	        
	    }
	 
	 public static void main(String [] args) {
		
		 int[] testIp= {3,2,2,0,1,2,0,4,5,0,7,2,3,0,9};
		 
		 System.out.println(removeElement(testIp,0));
		 
		 
		 
	 }

}
