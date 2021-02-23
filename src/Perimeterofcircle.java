import java.util.Scanner;

public class Perimeterofcircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double r = input.nextDouble();
        double perimeter = 2* r * 3.142;
        System.out.println("The perimeter of circle is: " + perimeter);
    }
}
