package Batch13Assignment;

import java.util.Scanner;

public class Question10A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------Distance Formula-----");
        System.out.println("Give me the initial Velocity(u): ");
        double u = input.nextDouble();
        System.out.println("Give the time taken (t): ");
        double t = input.nextDouble();
        System.out.println("Give me the acceleration(a): ");
        double a = input.nextDouble();
        double distance = (u*t) + (1/2*2f*a*t*t);
        System.out.println("The resulted distance value is: " +distance+ "m/s.");
    }
}
