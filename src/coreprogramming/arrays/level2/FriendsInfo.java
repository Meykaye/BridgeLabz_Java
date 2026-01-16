package coreprogramming.arrays.level2;
import java.util.Scanner;

/*
 * This class analyzes information about three predefined friends (Amar, Akbar, Anthony).
 * It reads their ages and heights, then identifies the youngest friend and the tallest
 * friend by comparing values stored in separate arrays. This demonstrates array comparison
 * and selection of extremal values (minimum and maximum).
 */
public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // Input age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i]);
            age[i] = sc.nextInt();

            System.out.println("Enter height of " + names[i]);
            height[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        // Find indices of youngest and tallest friends
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("Youngest Friend: " + names[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex]);
    }
}
