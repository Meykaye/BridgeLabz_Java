package coreprogramming.arrays.level2;
import java.util.Scanner;

/*
 * This class calculates Body Mass Index (BMI) for multiple people and categorizes
 * them based on their BMI values. It stores weight and height in separate arrays,
 * computes BMI using the formula weight/(height*height), and assigns health status
 * categories (Underweight, Normal, Overweight, Obese) accordingly.
 */
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Read weight and height for n people
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();
        }

        // Calculate BMI and assign weight status category for each person
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Categorize based on BMI thresholds
            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        // Output results for each person
        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + " " + weight[i] + " " + bmi[i] + " " + status[i]);
        }
    }
}

