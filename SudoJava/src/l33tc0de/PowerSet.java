package l33tc0de;

import java.util.Arrays;
import java.util.Scanner;

public class PowerSet {
     
    static void printPowerSet(char []set,
                            int set_size)
    {
         
        /*set_size of power set of a set
        with set_size n is (2**n -1)*/
        long pow_set_size =
            (long)Math.pow(2, set_size);
        int counter, j;
     
        /*Run from counter 000..0 to
        111..1*/
        for(counter = 0; counter <
                pow_set_size; counter++)
        {
        	
        	//char[] ss=new char[set_size];
        	String result="";
            for(j = 0; j < set_size; j++)
            {
            	
            	
                /* Check if jth bit in the
                counter is set If set then
                print jth element from set */
                if((counter & (1 << j)) > 0) {
                   // System.out.print(set[j]);
                char[] ss=(""+set[j]).toCharArray();
                Arrays.sort(ss);
                //System.out.print(ss);
                result+=ss+"";
                //System.out.print(result);
                }
            }
            
            System.out.print(result);
            System.out.println();
        }
    }
     
    // Driver program to test printPowerSet
    public static void main (String[] args)
    {
    	Scanner sc= new Scanner(System.in);
    	int total=Integer.valueOf(sc.next());
    	int noOftimes=Integer.valueOf(sc.next());
    	
    	char []set = new char[noOftimes];
    	
    	for(int i=0; i<set.length; i++) {
    		set[i]=sc.next().toCharArray()[0];
    	}
    	
    	
    	
        Arrays.sort(set);
        printPowerSet(set, set.length);
    }
}