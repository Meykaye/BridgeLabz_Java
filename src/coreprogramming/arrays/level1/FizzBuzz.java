package coreprogramming.arrays.level1;
import java.util.Scanner;

// This class implements the classic FizzBuzz problem using arrays
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 0) {
            return;
        }

        String[] result = new String[number + 1];

        // Populate array with FizzBuzz pattern:
        // - "FizzBuzz" for numbers divisible by both 3 and 5
        // - "Fizz" for numbers divisible by 3
        // - "Buzz" for numbers divisible by 5
        // - number as string otherwise
        for (int i = 0; i <= number; i++) {
            if (i != 0 && i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (i != 0 && i % 3 == 0) {
                result[i] = "Fizz";
            } else if (i != 0 && i % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i);
            }
        }

        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }
    }
}
