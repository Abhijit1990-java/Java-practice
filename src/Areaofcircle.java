import java.util.Scanner;

public class Areaofcircle{

    public static void main(String[] args) {
    Scanner number = new Scanner(System.in);
    System.out.println("Enter the radius");
    double r = number.nextDouble();
    double area = (3.142 * r * r);
    System.out.println("Area of circle is: " + area);

    }
}
