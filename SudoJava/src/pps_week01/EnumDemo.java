package pps_week01;

import java.lang.Math;

import pps_week01.EnumValuesDemo.WorkDay;


public class EnumDemo
{
    enum WorkDay {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
    //there's no assign operator OR '=' in initilization of enum;
    enum Rubic_colors {Yellow, Orange, Red, Blue, Green, White};
    
    enum PezColor {Yellow, Pink, Orange};

    public static void main(String[] args)
    {
        WorkDay startDay = WorkDay.MONDAY;
        WorkDay endDay = WorkDay.FRIDAY;
        String text = "Hello Universe";

        
        System.out.println(startDay.toString().toLowerCase());
        //System.out.println(Math.random().Rubic_colors);
        System.out.println("Work starts on " + startDay);
        System.out.println("Work ends on " + endDay);
        System.out.println(WorkDay.MONDAY.toString());
        System.out.println(WorkDay.MONDAY.ordinal());
        System.out.println("Rubic Color : " + Rubic_colors.Red.ordinal());
        //it returns the position of enums.
        System.out.println(endDay.ordinal());
        System.out.println(WorkDay.MONDAY.compareTo(WorkDay.WEDNESDAY));
        System.out.println(WorkDay.valueOf("MONDAY")); // a static method
       // System.out.println(WorkDay.valueOf("Monday")); // this will not work     
        System.out.println(WorkDay.valueOf("MONDAY")); // a static method
    }
}
