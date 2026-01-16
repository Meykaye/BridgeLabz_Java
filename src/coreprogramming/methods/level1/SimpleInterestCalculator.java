package coreprogramming.methods.level1;
import java.util.*;

/*
 * This class calculates simple interest using the financial formula:
 * Interest = (Principal * Rate * Time) / 100. It demonstrates financial
 * computation and the application of mathematical formulas in programming.
 */
public class SimpleInterestCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double si = simpleInterest(principal, rate, time);
        System.out.printf("Interest: %.2f", si);
        sc.close();
    }

    // Computes SI using the formula: (P * R * T) / 100
    private static double simpleInterest(double principal, double rate, double time){
        return (principal*rate*time) / 100;
    }
}
