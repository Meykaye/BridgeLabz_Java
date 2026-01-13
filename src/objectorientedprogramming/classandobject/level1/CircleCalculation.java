package objectorientedprogramming.classandobject.level1;
import java.util.Scanner;

class Circle {
    double radius;

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    void displayResult() {
        System.out.println(area());
        System.out.println(circumference());
    }
}

public class CircleCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        c.radius = sc.nextDouble();
        c.displayResult();
    }
}
