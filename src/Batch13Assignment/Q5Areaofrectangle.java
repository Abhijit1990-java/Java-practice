package Batch13Assignment;

import java.util.Scanner;

public class Q5Areaofrectangle {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the length");
        double l = number.nextDouble();
        System.out.println("Enter the breadth");
        double b = number.nextDouble();
        double area = (l*b);
        System.out.println("InterfaceExample.Area of rectangle is: " + area);
    }
}
