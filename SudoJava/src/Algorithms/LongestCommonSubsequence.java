package src.Algorithms;

public class LongestCommonSubsequence {


    /**
    @auther WaleedAhmed05
    Desc - Longest Common Subsequence Problem.
    SOEN-6651 - Algorithm Design Technique.
     **/


    //Longest Common sequence using Dynamic Programming.
    //Input X[1....i] , Y[1....j]
    //Output length of maximum subsequence between two strings.

    //Example Snowdon and Snowfly has 4 longest Common subsequence.
    // s - n - o -w =4.

    public static Character [] array1= {'s','n','o','w','d','o','n'};
    public static Character [] array2= {'s','n','o','w','f','l','y'};


    public static int LCS(){

        int m=array1.length;
        int n=array2.length;

        int DCS[][]= new int[m][n];

        for (int i=0; i<m; i++){
            DCS[i][0]=0; //base case, making first row 0.
        }
        for(int j=0; j<n; j++){
            DCS[0][j]=0; //base case, making first column 0.
        }

        for (int i=1; i<m; i++){

            for(int j=1; j<n; j++){

                //Computational Array
                DCS[i][j]=Math.max(DCS[i-1][j],DCS[i][j-1]);

                if(array1[i]==array2[j]){
                    DCS[i][j]=Math.max(DCS[i][j],DCS[i-1][j-1]+1);
                }
            }
        }

        //System.out.println("Answer  "+ DCS[array1.length-1][array2.length-1]);

        for(int i=0; i<DCS.length; i++ ){
            for(int j=0; j<DCS[0].length; j++){
                System.out.print(DCS[i][j]+ " ");
            }

            System.out.println("");

        }

        return DCS[m-1][n-1];

    }

    public static void main(String [] args)
    {
        System.out.println(LCS());

    }
}
