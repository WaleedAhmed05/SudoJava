package pps_week01;

import java.util.Scanner;

public class EnumValuesDemo
{
    enum WorkDay { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};

    public static void main(String[] args)
    {
        WorkDay[] day = WorkDay.values( );
        //System.out.println(day[1]);

        Scanner keyboard = new Scanner(System.in);
        
        double hours = 0,
        		sum = 0;

        System.out.println("Welcome to ADP Work Force. ");
        
        for (int i = 0; i < day.length; i++)
        {
        	
            System.out.println("Enter hours worked for " + day[i]+" :");
            hours = keyboard.nextDouble( );
            sum = sum + hours;
        }

        System.out.println("Total hours work = " + sum);
        System.out.println("If TAX %15, your Earnings: "+sum*14);
        System.out.println("If TAX %6, your Earnings: "+sum*15);
        System.out.println("Monthly Earning around: "+sum*15*4);
        
        keyboard.close();
    }
}
