package src.Algorithms;

import java.util.Arrays;

public class KnapSackUsingRecursion {


    public static int KS(int [] wt, int [] value, int weight, int n){

        if(n==0 || weight==0){ // this is base condition
            return 0; //return 0, if capacity OR weight is 0.
        }

        if(wt[n]<=weight){ //if current item weight is less or equals to weight.

            return Math.max(value[n-1]+KS(wt, value,weight-wt[n-1],n-1),
                    KS(wt, value, weight, n-1));
        }

        else
            return KS(wt, value, weight,n-1);
    }

    public static void main(String [] args){

        int [] wt= {1, 2, 1, 9, 1};
        int [] value={30, 40, 4, 70, 4};
        int w=11;

        int result= KS(wt,value,w,wt.length-1);
        System.out.println(result);
    }
}
