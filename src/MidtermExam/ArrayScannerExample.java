package MidtermExam;

import java.util.Scanner;

public class ArrayScannerExample {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Scanner input = new Scanner(System.in);
        for(int i=0; i<arr.length; i++) {
            System.out.println("Give me a number: ");
            arr[i]= input.nextInt();
        }
        int sum = 1;
        for (int j : arr) {
            System.out.println(j);
            sum = sum + j;
        }
        System.out.println("Sum of array number is: " + sum);
    }


}
