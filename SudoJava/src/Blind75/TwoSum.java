package src.Blind75;

import java.util.HashMap;

/*

URL: https://leetcode.com/problems/two-sum/

Problem:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Examples:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,2,4], target = 6
Output: [1,2]

Input: nums = [3,3], target = 6
Output: [0,1]

Solution:
Time complexity : O(n)
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        HashMap<Integer,Integer> remainders = new HashMap<>(); //Using Hashmap for linear time complexity.
        int remaining=0;
        int counter=0;

        for(int i: nums){ // traverse numbers in array to find difference in num[i] and target.
            remaining =target-i;
            if(remainders.containsKey(i)){
                results[0]=counter; //index of current num[i]
                results[1]=remainders.get(i); //index of already traversed number
            }
            else
                remainders.put(remaining,counter);

            counter++;
        }


        return results;
    }
}
