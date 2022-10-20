package src.Algorithms;


/**
 * author - WaleedAhmed05
 * Problem Longest Continous Sub array.
 * Solution - Using Divide and conquer strategy to find the highest values in an array.
 * Example - X = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,-15,-4,7,}
 * Here the optimal highest value will be the sum of 18 + 20 + -7 + 12 =43.
 *
 */
public class LongestContSubArray {






    public static int longestCrossArray(int [] A, int low,int mid, int high){

        int result=0;
        int L= Integer.MIN_VALUE;
        int R= Integer.MIN_VALUE;
        int s=0;

        for(int i=mid; i>=0; i--){

            result+=A[i];
            L=Math.max(L,result);

        }

        result=0;
        for(int i=mid+1; i<high; i++){
            result+=A[i];
            R=Math.max(R,result);
        }

        return L+R;

    }

    public static int longestArray(int [] A, int low, int high){
        //base cases.
        if(high==low+1){
            // means there's only two element in array;
            return A[low]+A[high];
        }

        if(high<=low)
            return 0;
        //it means no element exist to check now.

        int mid=(low+high) /2;

        int left= longestArray(A, low, mid);
        int right= longestArray(A, mid+1, high);
        int cross=longestCrossArray(A,low,mid,high);

        int temp=Math.max(left,right);

        return Math.max(temp,cross);

    }

    public static void main(String args[]){


        int [] X={13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,-15,-4,7,};

        int result=longestArray(X,0, X.length-1);
        System.out.println(result);

    }
}
