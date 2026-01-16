package coreprogramming.controlflows.level2;
import java.util.Scanner;

/*
 * This class calculates employee bonuses based on years of service.
 * Employees with more than 5 years of tenure receive a 5% bonus on their salary.
 * This demonstrates conditional bonus calculation based on employment duration.
 */
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

