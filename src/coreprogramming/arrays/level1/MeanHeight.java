package coreprogramming.arrays.level1;
import java.util.Scanner;

/*
 * This class calculates the mean (average) height of 11 students.
 * It reads heights from user input, sums them up, and divides by the count
 * to calculate the average. This demonstrates basic statistical calculation
 * and array traversal techniques.
 */
public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;

        // Read heights and accumulate their sum
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        // Calculate mean by dividing total sum by number of heights
        double mean = sum / heights.length;
        System.out.println("Mean height = " + mean);
    }
}

