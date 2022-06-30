package l33tc0de;

/**
* @author Waleed05
* @description-
* Given an integer array nums sorted in non-decreasing order,
* remove the duplicates in-place such that each unique element appears only once.
* The relative order of the elements should be kept the same.
* 
* Input: nums = [0,0,1,1,1,2,2,3,3,4]
* Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
* Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
* It does not matter what you leave beyond the returned k (hence they are underscores).
* 
*/

import java.util.ArrayList;

public class RemoveDuplicatesTwoSortedArrays {
	
	
public static int removeDuplicates(int[] nums) {
        
	 
	
	ArrayList<Integer> mylist= new ArrayList<Integer>();
	
     
	    int count=0;
        for(int i=0; i<nums.length; i++){
        if(!mylist.contains(nums[i])){        	  	
        	mylist.add(nums[i]);
            }       
        }
        
        for(int k=0; k<mylist.size(); k++) {
        	nums[count]=mylist.get(k);
        	count++;
     	}
        return mylist.size();
}

	
	public static void main (String [] args) {
		
		int[] myint= {1,1,2,3};
		
		System.out.println(removeDuplicates(myint));
	}

}
