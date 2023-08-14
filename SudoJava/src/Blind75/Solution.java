package src.Blind75;


import java.util.MissingResourceException;

//Main Driver to execute program.
public class Solution {

    public static void main(String args[]) {

        int [] nums =  {1,2,0,3,4};

        ProductOfArrayExceptIteself pk = new ProductOfArrayExceptIteself();


        for(int x: pk.productExceptSelf(nums)){
            System.out.println(x);
        }




    }



}
