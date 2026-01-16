package coreprogramming.programmingelements.level1;

// Program to distribute pens equally among students and show remaining pens
public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        // Calculate pens per student using division and get remainder
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        System.out.println(
                "The Pen Per Student is " + pensPerStudent +
                        " and the remaining pen not distributed is " + remainingPens
        );
    }
}

