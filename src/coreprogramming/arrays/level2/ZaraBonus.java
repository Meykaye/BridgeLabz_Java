package coreprogramming.arrays.level2;
import java.util.Scanner;

/*
 * This class calculates performance bonuses for employees based on their salary and
 * years of service. It uses 2D arrays to store employee data (salary and years of service)
 * and computes bonuses according to predefined criteria. This demonstrates 2D array
 * processing and business logic implementation for employee compensation.
 */
public class ZaraBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] empData = new double[10][2];  // [0]=salary, [1]=years of service
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Read salary and years of service for 10 employees, validating positive values
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i + 1));
            double salary = sc.nextDouble();

            System.out.println("Enter years of service for employee " + (i + 1));
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }

            empData[i][0] = salary;
            empData[i][1] = years;
        }

        // Calculate bonus (5% for >5 years, 2% otherwise) and new salary
        for (int i = 0; i < 10; i++) {
            double salary = empData[i][0];
            double years = empData[i][1];

            // Bonus calculation based on service duration
            if (years > 5) {
                bonus[i] = salary * 0.05;
            } else {
                bonus[i] = salary * 0.02;
            }

            newSalary[i] = salary + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary;
            totalNewSalary += newSalary[i];
        }

        // Display summary totals
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}

