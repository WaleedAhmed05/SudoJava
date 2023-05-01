package src.Blind75;


import java.util.HashMap;

/*
URL: https://leetcode.com/problems/valid-anagram/
Problem:
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a
different word or phrase, typically using all the original letters exactly once.

Examples:
Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "rat", t = "car"
Output: false


Solution:
Time complexity O(n)
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) //early exit - if both strings length are not same, they can't be valid anagram.
            return false;

        HashMap<Character, Integer> sMap = new HashMap<>(); // using hashmap O(1) to store frequency of 's' string.
        for (char i : s.toCharArray()) { //O(n) traversing s string letters.
            if (sMap.containsKey(i)) {
                sMap.put(i, sMap.get(i) + 1);
            } else
                sMap.put(i, 1);
        }

        for (char x : t.toCharArray()) { // O(n) now traversing t string letter and checking frequencies in hashmap.
            if (sMap.containsKey(x)) {
                if (sMap.get(x) > 0) {
                    sMap.put(x, sMap.get(x) - 1);
                } else
                    return false;
            } else
                return false;
        }
        return true;
    }

}
