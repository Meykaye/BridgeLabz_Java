package coreprogramming.methods.level2;
import java.util.*;

// Converts between: Fahrenheit/Celsius, pounds/kg, gallons/liters
public class UnitConverterTemperatureWeight {
    // Temperature and weight conversions: F to C, C to F, pounds to kg, kg to pounds, gallons to liters, liters to gallons
    static double fToC(double v){return (v-32)*5/9;}
    static double cToF(double v){return (v*9/5)+32;}
    static double poundsToKg(double v){return v*0.453592;}
    static double kgToPounds(double v){return v*2.20462;}
    static double gallonsToLiters(double v){return v*3.78541;}
    static double litersToGallons(double v){return v*0.264172;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        System.out.println(fToC(v));
        System.out.println(cToF(v));
        System.out.println(poundsToKg(v));
        System.out.println(kgToPounds(v));
        System.out.println(gallonsToLiters(v));
        System.out.println(litersToGallons(v));
    }
}