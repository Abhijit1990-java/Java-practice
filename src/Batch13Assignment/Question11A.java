package Batch13Assignment;

public class Question11A {
    public static void main(String[] args) {
        float first = 15f;
        float second = 20f;
        System.out.println("---BeforeSwap----");
        System.out.println("first number = " +first);
        System.out.println("Second number = " +second);
        float temporary = first;
        first = second;
        second = temporary;
        System.out.println("----After Swap------");
        System.out.println("first number = " +first);
        System.out.println("second number = " +second);
    }
}
