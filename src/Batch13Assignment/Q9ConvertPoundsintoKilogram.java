package Batch13Assignment;

import java.util.Scanner;

public class Q9ConvertPoundsintoKilogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of pounds");
        double pounds = input.nextDouble();
        double kilogram = pounds * 0.454;
        System.out.println(pounds + "pounds is" +kilogram+ "kilograms");

    }
}
