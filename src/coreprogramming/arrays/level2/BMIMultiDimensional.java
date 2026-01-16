package coreprogramming.arrays.level2;
import java.util.Scanner;

// This class calculates BMI using 2D arrays and categorizes health status
public class BMIMultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        double[][] personData = new double[number][3];  // [0]=weight, [1]=height, [2]=bmi
        String[] weightStatus = new String[number];

        // Read weight and height for each person, validating positive values
        for (int i = 0; i < number; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();

            if (weight <= 0 || height <= 0) {
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
        }

        // Calculate BMI and categorize health status
        for (int i = 0; i < number; i++) {
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            personData[i][2] = bmi;

            // Assign health category based on BMI value
            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Display results
        for (int i = 0; i < number; i++) {
            System.out.println(
                    personData[i][1] + " " +
                            personData[i][0] + " " +
                            personData[i][2] + " " +
                            weightStatus[i]
            );
        }
    }
}