package src.Blind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
URL: https://leetcode.com/problems/top-k-frequent-elements/
Problem Statement

Given an integer array nums and an integer k,return the k most frequent elements.
You may return the answer in any order.

Examples:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Input: nums = [1], k = 1
Output: [1]


Constraints:
    1 <= nums.length <= 105
    -104 <= nums[i] <= 104
    k is in the range [1, the number of unique elements in the array].

Solution:
Time complexity:
 */
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] mostFrequentElement = new int[k];
        //Integer, frequency.

        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }

        List[] frequency_table= new List[nums.length+1];

        for(Map.Entry<Integer,Integer> x: map.entrySet()){
            int index = x.getValue(); //here frequency is index of array.
            if(!frequency_table[index].isEmpty()){
                //List<Integer> list = frequency_table[index];
                frequency_table[index].add(x.getKey());
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(x.getKey());
                frequency_table[index] = list;
            }

        }

        int counter=0;
        for(int i=frequency_table.length; i>=0; i--){

            if(k<1){
                break;
            }
            if(!frequency_table[i].isEmpty()){
                //mostFrequentElement[counter]=frequency_table[i].get(0);
            }
        }


        return new int[5];
    }
}
