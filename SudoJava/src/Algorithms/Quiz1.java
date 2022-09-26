package src.Algorithms;


//Checking time complexity of two nested log loops.
public class Quiz1 {



    public static double minX(double n1, double n2){

        if(n1>n2)
            return n2;
        else
            return n1;
    }

    public static void funct(int n){


        int counter=1;
        for(int i=1; i<n-(Math.log10(n)); i++){
            for(int j=i; j<minX(n,i+Math.log10(n)); j++)
            {

                System.out.println(counter);
                counter++;

            }
        }

    }

    public static void main(String [] args){

        int n=10;
        funct(n);
        System.out.println("Actual Value "+ n*Math.log10(n));

    }
}
