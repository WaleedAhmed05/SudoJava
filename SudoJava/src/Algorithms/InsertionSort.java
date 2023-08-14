package src.Algorithms;


/**
 * Author - WaleedAhmed05
 * Problem - Insertion Sort using two for loops
 * Time Complexity - O(n^2)
 */
public class InsertionSort {



    public static int [] InsertSort(int X[]){

        for(int i=1; i<X.length; i++){

            int currentValue=X[i]; //2
            int j=i-1; //0
            for ( ; (j >= 0 && X[j] > currentValue); j--) {



            if(X[j]>currentValue)
                    X[j+1]=X[j];
                printArray(X);
            }
            X[j+1]=currentValue;

            System.out.println("Outer ");
            printArray(X);
            System.out.println("-------");

        }



        return X;
    }


    public static void printArray(int X[]){

        for (int i=0; i<X.length; i++){
            System.out.print(X[i]+" ");
        }
        System.out.println();
    }




    public static void main(String [] args){

        int[] arrayX={5,4,3,2,1};
        int[] result=InsertSort(arrayX);

        for (int i=0; i<result.length; i++){

            System.out.print(result[i]+" ");
        }

    }


}
