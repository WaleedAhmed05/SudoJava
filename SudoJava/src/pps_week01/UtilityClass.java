package pps_week01;;
public class UtilityClass
{
    /**
     Returns the largest of any number of int values.
    */
   public static int max(int... arg)
    {
        if (arg.length == 0)
        {
           System.out.println("Fatal Error: maximum of zero values.");
           System.exit(0);
        }

        int largest = arg[0];
        String[] test= new String[3];
        test[0]="tom";
        test[1]="dick";
        test[2]="herriet";
        String highest_scorer=test[0];
        for (int i = 1; i < arg.length; i++) {
            if (arg[i] > largest) {
                largest = arg[i];
                highest_scorer=test[i];
            }
            
        
            
        }
        System.out.println("Highest Scorer is: "+highest_scorer);
        return largest;
    }
   
 //  public static string()
}

