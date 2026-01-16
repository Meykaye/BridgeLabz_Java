package coreprogramming.programmingelements.level1;

// Program to calculate average marks in Physics, Chemistry, and Mathematics
public class AveragePCM {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        // Calculate average of three subjects
        double average = (maths + physics + chemistry) / 3.0;

        System.out.println("Sam’s average mark in PCM is " + average);
    }
}

