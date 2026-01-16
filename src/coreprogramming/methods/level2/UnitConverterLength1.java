package coreprogramming.methods.level2;
import java.util.*;

// Converts between different length units: km/miles, meters/feet
public class UnitConverterLength1 {
    // Length conversions: km to miles, miles to km, meters to feet, feet to meters
    static double kmToMiles(double v){return v*0.621371;}
    static double milesToKm(double v){return v*1.60934;}
    static double metersToFeet(double v){return v*3.28084;}
    static double feetToMeters(double v){return v*0.3048;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        System.out.println(kmToMiles(v));
        System.out.println(milesToKm(v));
        System.out.println(metersToFeet(v));
        System.out.println(feetToMeters(v));
    }
}