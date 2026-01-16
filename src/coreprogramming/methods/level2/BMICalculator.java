package coreprogramming.methods.level2;
import java.util.*;

/*
 * This class calculates Body Mass Index (BMI) for 10 people and classifies them
 * based on BMI ranges (Underweight, Normal, Overweight, Obese).
 * It demonstrates method-based computation and data classification.
 */
public class BMICalculator{
    // Calculates BMI: weight(kg) / (height(m))^2. Height is converted from cm to m
    static double bmi(double w,double h){
        h=h/100;
        return w/(h*h);
    }
    // Returns BMI status: Underweight, Normal, Overweight, or Obese
    static String status(double b){
        if(b<18.5) return "Underweight";
        if(b<25) return "Normal";
        if(b<30) return "Overweight";
        return "Obese";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            double w=sc.nextDouble();
            double h=sc.nextDouble();
            double b=bmi(w,h);
            System.out.println(w+" "+h+" "+b+" "+status(b));
        }
    }
}

