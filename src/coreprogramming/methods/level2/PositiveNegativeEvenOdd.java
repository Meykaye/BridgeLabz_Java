package coreprogramming.methods.level2;
import java.util.*;

// Tests numbers for properties: positive/negative, even/odd, and compares two numbers
public class PositiveNegativeEvenOdd {
    // Checks if number is non-negative (positive or zero)
    static boolean positive(int n){return n>=0;}
    // Checks if number is even
    static boolean even(int n){return n%2==0;}
    // Compares two numbers: returns 1 if a>b, 0 if a==b, -1 if a<b
    static int compare(int a,int b){
        if(a>b) return 1;
        if(a==b) return 0;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0;i<5;i++) a[i]=sc.nextInt();
        for(int x:a){
            if(positive(x)) System.out.println(even(x));
            else System.out.println("Negative");
        }
        System.out.println(compare(a[0],a[4]));
    }
}

