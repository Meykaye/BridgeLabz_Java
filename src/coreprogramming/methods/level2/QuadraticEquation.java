package coreprogramming.methods.level2;
import java.util.*;

// Solves quadratic equations (ax^2 + bx + c = 0) and returns real roots
public class QuadraticEquation {
    // Calculates discriminant and returns roots using quadratic formula
    // Returns 2 roots if discriminant > 0, 1 root if discriminant == 0, no roots if < 0
    static double[] roots(double a,double b,double c){
        double d=Math.pow(b,2)-4*a*c;
        if(d>0) return new double[]{(-b+Math.sqrt(d))/(2*a),(-b-Math.sqrt(d))/(2*a)};
        if(d==0) return new double[]{-b/(2*a)};
        return new double[0];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println(Arrays.toString(roots(a,b,c)));
    }
}

