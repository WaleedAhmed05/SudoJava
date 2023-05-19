package src.Blind75;

import java.util.*;

/*
URL: https://leetcode.com/problems/group-anagrams/
Problem Statement

Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Examples:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Input: strs = [""]
Output: [[""]]

Constraints:
    1 <= strs.length <= 104
    0 <= strs[i].length <= 100
    strs[i] consists of lowercase English letters.

Solution:
Time complexity: O(nlogn)
 */


public class GroupAnagrams {

    public String sortedword(char[] arr){
        Arrays.sort(arr);
        String word="";
        for(char x: arr){
            word+=x;
        }
        return word;
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> mylist = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String temp_word=sortedword(strs[i].toCharArray());
            if(map.containsKey(temp_word)){
                List<String> temp_list = map.get(temp_word);
                temp_list.add(strs[i]);
                map.put(temp_word,temp_list);
            }
            else {
                List<String> temp_list = new ArrayList<>();
                temp_list.add(strs[i]);
                map.put(temp_word,temp_list);
            }
        }
        for(Map.Entry<String,List<String>> x: map.entrySet()){
            mylist.add(x.getValue());
        }
        return mylist;
    }

    public void printlist(List<List<String>> mylist){

        for(int i=0; i<mylist.size(); i++){
            for(int j=0; j<mylist.get(i).size(); j++){
                System.out.print(mylist.get(i).get(j)+" ");
            }
            System.out.println();

        }

    }

}

