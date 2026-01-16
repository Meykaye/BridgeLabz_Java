package coreprogramming.methods.level3;

import java.util.Scanner;

/*
 * This class performs various operations on matrices including creation,
 * manipulation, and computation. It implements fundamental matrix algorithms
 * such as transposition, element access, and other 2D array operations.
 */
public class MatrixOperations {

    static int[][] createMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = (int)(Math.random() * 10);
        return m;
    }

    static int[][] add(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    static int[][] subtract(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    static int[][] multiply(int[][] a, int[][] b) {
        int r = a.length, c = b[0].length, k = b.length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                for (int l = 0; l < k; l++)
                    res[i][j] += a[i][l] * b[l][j];
        return res;
    }

    static int[][] transpose(int[][] a) {
        int r = a.length, c = a[0].length;
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                t[j][i] = a[i][j];
        return t;
    }

    static int determinant2x2(int[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    static int determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    static void display(int[][] m) {
        for (int[] ints : m) {
            for (int j = 0; j < m[0].length; j++)
                System.out.print(ints[j] + "\t");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows and Columns of first matrix: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int[][] a = createMatrix(r1, c1);
        System.out.println("Matrix A:");
        display(a);

        System.out.print("Rows and Columns of second matrix: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        int[][] b = createMatrix(r2, c2);
        System.out.println("Matrix B:");
        display(b);

        if (r1 == r2 && c1 == c2) {
            System.out.println("A + B:");
            display(add(a,b));
            System.out.println("A - B:");
            display(subtract(a,b));
        }

        if (c1 == r2) {
            System.out.println("A * B:");
            display(multiply(a,b));
        }

        System.out.println("Transpose of A:");
        display(transpose(a));

        if (r1 == 2 && c1 == 2) {
            System.out.println("Determinant of A (2x2): " + determinant2x2(a));
        }
        if (r1 == 3 && c1 == 3) {
            System.out.println("Determinant of A (3x3): " + determinant3x3(a));
        }
    }
}
