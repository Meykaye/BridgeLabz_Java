package coreprogramming.methods.level2;
import java.util.*;

/*
 * This class provides methods to convert between different length units:
 * yards/feet, meters/inches, and inches/centimeters.
 * It demonstrates varied unit conversion formulas and conversions.
 */
public class UnitConverterLength2 {
    // Length conversions: yards/feet, meters/inches, inches/cm
    static double yardsToFeet(double v){return v*3;}
    static double feetToYards(double v){return v*0.333333;}
    static double metersToInches(double v){return v*39.3701;}
    static double inchesToMeters(double v){return v*0.0254;}
    static double inchesToCm(double v){return v*2.54;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        System.out.println(yardsToFeet(v));
        System.out.println(feetToYards(v));
        System.out.println(metersToInches(v));
        System.out.println(inchesToMeters(v));
        System.out.println(inchesToCm(v));
    }
}

