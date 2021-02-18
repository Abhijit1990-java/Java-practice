import java.util.Scanner;

public class Addition1 {


    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = number.nextInt();
        System.out.println("Enter b: ");
        int b = number.nextInt();

        int sum = a + b;

        System.out.println(sum);
        System.out.println("sum of a and b is: " + sum);
        System.out.println("sum of" + a + "and" + b + "is: " + sum);
    }
}

