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

        for(int i: nums){ //storing frequency of each element in hashmap.
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }

        List[] frequency_table= new List[nums.length+1]; //array of list.
        //Here indexes of this array are frequency of "nums"

        for(Map.Entry<Integer,Integer> x: map.entrySet()){
            ; //it will be index for frequency_table.
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
        for(int i=frequency_table.length-1; i>=0; i--){

            if(counter==k) {
                System.out.println("it should stop here!");
                break; //Only append top K frequent elements.
            }

            System.out.println("freg: "+i);
            for(int j=0; j<frequency_table[i].size(); j++){

                if(!frequency_table[i].isEmpty()){
                    mostFrequentElement[counter]=(int)frequency_table[i].get(j);
                    System.out.println(frequency_table[i].get(j));
                    counter++;
                }

            }

        }


//        for(int i=frequency_table.length; i>=0; i--){
//
//            if(k<1){
//                break;
//            }
//            if(!frequency_table[i].isEmpty()){
//                //mostFrequentElement[counter]=frequency_table[i].get(0);
//            }
//        }

//        for(Map.Entry<Integer,Integer> x: map.entrySet()){
//            int index = x.getValue(); //here frequency is index of array.
//            if(!frequency_table[index].isEmpty()){
//                //List<Integer> list = frequency_table[index];
//                frequency_table[index].add(x.getKey());
//            }
//            else{
//                List<Integer> list = new ArrayList<>();
//                list.add(x.getKey());
//                frequency_table[index] = list;
//            }
//
//        }
//
//        int counter=0;



        return mostFrequentElement;
    }
}
