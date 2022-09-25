package src.others;

import java.util.Scanner;


/**
 * @author WaleedAhmed05
 * @version 1.0
 */
public class DistanceBetween2Cordinates {

    //Function to find distance in Km between two cordinates
    public static double distance(double lat1, double lon1, double lat2, double lon2) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        return (dist);
    }

    //distance between two gps coordinates using latitude and longitude in radians
    public static double distanceInRadians(double lat1, double lon1, double lat2, double lon2) {
        double theta = lon1 - lon2;
        double dist = Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(theta);
        dist = Math.acos(dist);
        dist = dist * 60 * 1.1515;
        return (dist);
    }

    //Function to convert degrees to radians
    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    //Function to convert radians to degrees
    private static double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }


    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Latitude X1:  ");
        double x1 = sc.nextDouble();

        System.out.println("Please Enter Longitude Y1:  ");
        double y1 = sc.nextDouble();

        System.out.println("Please Enter Latitude X2:  ");
        double x2 = sc.nextDouble();

        System.out.println("Please Enter Longitude Y2:  ");
        double y2 = sc.nextDouble();

        System.out.println("Distance between two cordinates is: " + distanceInRadians(x1, y1, x2, y2) + " Km");

    }
}
