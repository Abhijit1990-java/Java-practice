import java.util.Scanner;

public class Perimeterofrectangle {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        double l = number.nextDouble();
        System.out.println("Enter the width of rectangle");
        double w = number.nextDouble();
        double perimeter =(2*(l + w));
        System.out.println("The perimeter of rectangle is: " + perimeter);
    }
}
