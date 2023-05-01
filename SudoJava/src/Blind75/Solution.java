package src.Blind75;


//Main Driver to execute program.
public class Solution {

    public static void main(String args[]) {

        int[] nums={11,7,15,2};
        int target = 26;

        TwoSum tsum = new TwoSum();
        tsum.twoSum(nums,target);
        int [] a =tsum.twoSum(nums,target);
        System.out.println(a[0] +" " + a[1]);



    }



}
