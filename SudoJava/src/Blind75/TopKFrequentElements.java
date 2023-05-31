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
Time complexity: BigO(n) times.
 */
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] mostFrequentElement = new int[k]; //function will return top Most freq elements.


        for(int i: nums){ //storing frequency of each element in hashmap.
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }//map.

        List[] frequency_table= new List[nums.length+1]; //array of Lists.
        //Here index numbers of this array are frequency of "nums".

        int counter_map=0;
        for(Map.Entry<Integer,Integer> x: map.entrySet()){

            if(frequency_table[x.getValue()]==null){ //if Frequency_table index is empty.
                frequency_table[x.getValue()] = new ArrayList<>();
                frequency_table[x.getValue()].add(x.getKey()); //add element into frequency table.
            }
            else {

                frequency_table[x.getValue()].add(x.getKey()); //add element into frequency table.
            }

        }

        for(int i=0; i<frequency_table.length; i++){
            if(frequency_table[i]==null){
                frequency_table[i]= new ArrayList();
            }
        }

        int counter=0;
        outerloop:
        for(int i=frequency_table.length-1; i>=0; i--){
            for(int j=0; j<frequency_table[i].size(); j++){
                if(!frequency_table[i].isEmpty()){
                    mostFrequentElement[counter]=(int)frequency_table[i].get(j);
                    counter++;

                }

                if(counter==k) {
                    break outerloop; //Only append top K frequent elements.
                }

            }

        }


        return mostFrequentElement;
    }
}
