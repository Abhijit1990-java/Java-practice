import java.util.Scanner;

public class Volumeofcylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder");
        double r = input.nextDouble();
        System.out.println("Enter the length of cylinder");
        double l = input.nextDouble();
        double area = 3.1426 * r * r;
        double volume = 3.1426 *r * r * l;
        System.out.println("The area of cylinder is: " + area);
        System.out.println("The volume of cylinder is: " + volume);

    }
}
