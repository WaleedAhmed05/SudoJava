package src.Blind75;

import java.util.HashSet;

/*
URL: https://leetcode.com/problems/contains-duplicate
Problem Statement

Given an integer array nums, return true if any value appears at
least twice in the array, and return false if every element is distinct.

Examples:

Input: nums = [1,2,3,1]
Output: true

Input: nums = [1,2,3,4]
Output: false

Constraints:

     1 <= nums.length <= 105
    -109 <= nums[i] <= 109


Solution:
Time complexity: O(n)
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hmap= new HashSet<>(); //Use hashset for O(1) time complexity for searching.
        for (int i: nums){
            if(hmap.contains(i)){
                return true;
            }
            else
                hmap.add(i);
        }
        return false;
    }



}
