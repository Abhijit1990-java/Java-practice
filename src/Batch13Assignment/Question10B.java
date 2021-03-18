package Batch13Assignment;

import java.util.Scanner;

public class Question10B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Formula for Area of Triangle");
        System.out.println("Give me the height of Triangle(h)");
        double x = input.nextDouble();
        System.out.println("Enter the base of triangle(b)");
        double y = input.nextDouble();
        System.out.println("Enter the remaining side of triangle(b)");
        double z = input.nextDouble();
        double S = (x+y+z)/2.2f;
        double Area = Math.sqrt(S*(S-x)*(S-y)*(S-z));



    }
}
