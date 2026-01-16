package coreprogramming.string.level3;
import java.util.*;

/*
 * BMI: Calculates Body Mass Index for multiple individuals and classifies their
 * health status as Underweight, Normal, Overweight, or Obese based on BMI ranges.
 * Processes weight and height data to compute accurate health assessments.
 */
public class BMI {
    // Calculate BMI for each person and determine health status (Underweight, Normal, Overweight, Obese)
    public static String[][] calculateBMI(double[][] data){
        String[][] result = new String[data.length][4];
        for(int i=0;i<data.length;i++){
            double weight = data[i][0];
            double heightM = data[i][1]/100.0;
            double bmi = weight / (heightM*heightM);
            String status;
            if(bmi<18.5) status = "Underweight";
            else if(bmi<25) status = "Normal";
            else if(bmi<30) status = "Overweight";
            else status = "Obese";
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(data[i][0]);
            result[i][2] = String.format("%.2f",bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Display 2D array in formatted table output
    public static void display2D(String[][] arr){
        System.out.printf("%-10s %-10s %-10s %-10s\n","Height","Weight","BMI","Status");
        for(String[] row: arr){
            System.out.printf("%-10s %-10s %-10s %-10s\n",row[0],row[1],row[2],row[3]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for(int i=0;i<10;i++){
            System.out.print("Enter weight(kg) and height(cm) for person "+(i+1)+": ");
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        String[][] bmiResult = calculateBMI(data);
        display2D(bmiResult);
    }
}