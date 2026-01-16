package coreprogramming.methods.level2;
import java.util.*;

/*
 * This class generates random numbers and computes their statistics
 * including minimum, maximum, and average values.
 * It demonstrates random number generation and statistical analysis.
 */
public class RandomNumberStatistics {
    static int[] generate(int n){
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=(int)(Math.random()*9000)+1000;
        return a;
    }
    static double[] stats(int[] a){
        int min=a[0],max=a[0],sum=0;
        for(int x:a){
            sum+=x;
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        return new double[]{(double)sum/a.length,min,max};
    }
    public static void main(String[] args){
        int n = 5;
        int[] a=generate(n);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(stats(a)));
    }
}

