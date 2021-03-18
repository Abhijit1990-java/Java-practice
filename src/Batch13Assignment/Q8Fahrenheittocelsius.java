package Batch13Assignment;

import java.util.Scanner;

public class Q8Fahrenheittocelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of fahrenheit");
        double fahrenheit = input.nextDouble();
        double celsius = ((5*(fahrenheit-32.0))/9);
        System.out.println(fahrenheit + "degree fahrenheit is equal to " + celsius + "in celsius");


    }
}

