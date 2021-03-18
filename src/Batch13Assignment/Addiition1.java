package Batch13Assignment;

import java.util.Scanner;

public class Addiition1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = number.nextInt();
        System.out.println("Enter the number b: ");
        int b = number.nextInt();

        int sum = a + b;
        System.out.println("the sum of a and b is:" +sum);
    }
}
