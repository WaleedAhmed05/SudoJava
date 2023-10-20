package src.AssesmentExams;

import java.util.ArrayList;
import java.util.List;

public class CodeSignal {




    String solution(String s) {

        if(s.length()==0){
            return "";
        }
        char[] str_char_arr= s.toCharArray();
        List<String> pref_arr = new ArrayList();

        String temp_word="";
        for(int i=0; i<str_char_arr.length; i++){
            temp_word+=str_char_arr[i];
            pref_arr.add(temp_word);
        }


        String highest_palindrome_str="";
        int highest_palindrome_str_len=0;
        int counter=0;
        for(int i=0; i<pref_arr.size(); i++){

            if(pref_arr.get(i).length()>1 && isPalindrome(pref_arr.get(i))){
                counter++;
            }

            if(pref_arr.get(i).length()>1 && isPalindrome(pref_arr.get(i)) &&
                    pref_arr.get(i).length()>highest_palindrome_str_len){
                highest_palindrome_str_len=pref_arr.get(i).length();
                highest_palindrome_str=pref_arr.get(i);
            }
        }



        String rem_str=s.replace(highest_palindrome_str,"");
        if(counter<1){
            return rem_str;
        }
        return solution(rem_str);

    }

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
