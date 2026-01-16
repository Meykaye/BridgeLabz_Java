package coreprogramming.arrays.level1;
import java.util.Scanner;

/*
 * This class demonstrates matrix to array conversion.
 * It reads a 2D matrix (2D array) and copies all its elements sequentially
 * into a 1D array in row-major order. This is useful for understanding
 * how multi-dimensional arrays can be flattened into single-dimensional arrays.
 */
public class ArrayCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];
        int index = 0;

        // Read matrix elements and copy them sequentially to a 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                array[index++] = matrix[i][j];
            }
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}

