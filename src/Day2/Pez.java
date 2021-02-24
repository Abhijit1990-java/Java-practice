package Day2;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Author: Abhijit Tumbahangphe
 * Since: 2/10/2020
 */
public class Pez {

    public static void main(String[] args) {
        //for making order in a list wise
        LinkedList<Integer> color  = new LinkedList<>();
        //taking user input
        Scanner input = new Scanner(System.in);
        //Printing the initial output
        System.out.println("Dispenser is empty");
        //using loop to find decrement of candy one by one
        for (int j = 1; j <= 10; j++) {
            System.out.println("Enter the number of candy: " + j);
            color.add(input.nextInt());

        }
        //Total number of candy count.
        System.out.println("['1','2','3','4','5','6','7','8','9','10']");
        System.out.println("Dispenser is Full Now.");


        //using loop for decrement order


        for(byte row= 1; row <= 9; row++){
            for(byte num =1; num <=(byte) (9-row + 1); num++){
                System.out.print("[" + num + "]");
            }
            System.out.println();
        }
        System.out.println("[0]");
        System.out.println("Dispenser is Empty Now");
    }
}
