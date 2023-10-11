package src.l33tc0de;

public class LengthofLastWord {


    public static int lengthOfLastWord(String s) {

        int result=0;
        String[] arr= s.split(" ");
        result=arr[arr.length-1].length();
        return result;
    }

    public static void main(String args[]){

        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));

    }
}
