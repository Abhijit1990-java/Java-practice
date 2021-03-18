package Batch13Assignment;

import java.util.Scanner;

public class Q6Perimeteroftriangle {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the 1st side of triangle");
        double a = number.nextDouble();
        System.out.println("Enter the 2nd side of triangle");
        double b = number.nextDouble();
        System.out.println("Enter the base of the triangle");
        double c = number.nextDouble();
        double perimeter = a + b +c;
        System.out.println("The perimeter of triangle is: " + perimeter);
    }
}
