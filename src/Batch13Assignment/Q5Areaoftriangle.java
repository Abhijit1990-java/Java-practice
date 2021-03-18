package Batch13Assignment;

import java.util.Scanner;

public class Q5Areaoftriangle {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the base of triangle");
        double b = number.nextDouble();
        System.out.println("Enter the height of triangle");
        double h = number.nextDouble();
        double area = b*h/2;
        System.out.println("InterfaceExample.Area of triangle is: " +area);
    }
}
