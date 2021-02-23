import java.util.Scanner;

public class Areaofrectangle {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the length");
        double l = number.nextDouble();
        System.out.println("Enter the breadth");
        double b = number.nextDouble();
        double area = (l*b);
        System.out.println("Area of rectangle is: " + area);
    }
}
