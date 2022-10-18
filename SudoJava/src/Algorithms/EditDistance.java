package src.Algorithms;


/**
 * auther WaleedAhmed05
 * Problem -Find the minimum number of operations required to Match 2 strings, X and Y.
 * Operations - Insert, Delete, substitute.
 * Example - "X= S O N W D N O, Y= S N O W D O N requires at least 4 operations.
 * Solution - With Dynamic programming.
 *
 */

public class EditDistance {

    public static int compute(String X, String Y){

        char[] Xchar = X.toCharArray();
        char[] Ychar = Y.toCharArray();

        int [][] Edit =new int [Xchar.length][Ychar.length];



        if(Xchar.length==0){ // If Xchar is empty then we have to add all characters from Ychar.
            return Ychar.length;
        }

        if(Ychar.length==0){ //If Ychar is empty, it means we have to do no operations.
            return 0;
        }

        for(int i=0; i< Xchar.length; i++){
            Edit[i][0]=i;
        }

        for(int j=0; j< Ychar.length; j++){
            Edit[0][j]=j;
        }




        for(int i=1; i<Xchar.length; i++){
            for(int j=1; j<Ychar.length; j++){

                int min= Math.min(1+Edit[i-1][j],1+Edit[i][j-1]);

                if(Xchar[i]!=Ychar[j]){
                    Edit[i][j]=Math.min(1+Edit[i-1][j-1],min);
                }

                else{
                    Edit[i][j]=Math.min(0+Edit[i-1][j-1],min);
                }
            }
        }

        System.out.print("  ");
        for(int i=0; i<Edit[0].length; i++){

            System.out.print(Ychar[i]+ " ");
        }
        System.out.println();
     for(int i=0; i<Edit.length; i++){

         System.out.print(Xchar[i]+ " ");

         for(int j=0; j<Edit[0].length; j++){
             System.out.print(Edit[i][j]+" ");


         }
         System.out.println();
     }
        return Edit[Xchar.length-1][Ychar.length-1];
    }

    public static void main(String [] args){

        int result=compute("CounterStrike", "CounterZero");
        System.out.println("Total Operations required = "+result);


    }
}
