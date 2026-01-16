package coreprogramming.methods.level3;
import java.util.Scanner;

/*
 * This class calculates performance bonuses for employees based on their
 * salary and years of service. It demonstrates human resources calculations
 * and compensation structure implementation.
 */
public class EmployeeBonus {

    static double[][] generateSalaryYears(int n) {
        double[][] arr = new double[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = (int)(Math.random() * 90000) + 10000; // salary 10000-99999
            arr[i][1] = (int)(Math.random() * 10) + 1;       // years 1-10
        }
        return arr;
    }

    static double[][] calculateBonus(double[][] arr) {
        int n = arr.length;
        double[][] newArr = new double[n][3]; // old salary, bonus %, new salary
        for (int i = 0; i < n; i++) {
            double salary = arr[i][0];
            double years = arr[i][1];
            double bonus = (years > 5) ? 0.05 * salary : 0.02 * salary;
            newArr[i][0] = salary;
            newArr[i][1] = bonus;
            newArr[i][2] = salary + bonus;
        }
        return newArr;
    }

    static void displayBonus(double[][] arr) {
        System.out.println("OldSalary\tBonus\tNewSalary");
        double totalOld = 0, totalBonus = 0, totalNew = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\n", arr[i][0], arr[i][1], arr[i][2]);
            totalOld += arr[i][0];
            totalBonus += arr[i][1];
            totalNew += arr[i][2];
        }
        System.out.printf("Total: %.2f\t%.2f\t%.2f\n", totalOld, totalBonus, totalNew);
    }

    public static void main(String[] args) {
        double[][] emp = generateSalaryYears(10);
        double[][] bonus = calculateBonus(emp);
        displayBonus(bonus);
    }
}
