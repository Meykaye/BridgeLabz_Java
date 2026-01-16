package coreprogramming.controlflows.level2;
import java.util.Scanner;

// Calculates employee bonus based on years of service (5% of salary if tenure > 5 years)
public class EmployeeBonus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int years = sc.nextInt();

        double bonus = (years > 5) ? salary * 0.05 : 0;
        System.out.println("The bonus amount is INR " + bonus);

        sc.close();
    }
}

