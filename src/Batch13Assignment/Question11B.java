package Batch13Assignment;

public class Question11B {
    public static void main(String[] args) {
        float input1 = 76f;
        float input2 = 80f;
        System.out.println("----Before Swap-----");
        System.out.println("Input 1 Number = " +input1);
        System.out.println("Input 2 Number = " +input2);

        input1 = input1 - input2;
        input2 = input1 + input2;
        input1 = input2 - input1;
        System.out.println("-----After Swap----");
        System.out.println("Input 1 Number = " +input1);
        System.out.println("Input 2 Number = " +input2);

    }
}
