package MidtermExam;

import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList<String> Phone = new ArrayList<>();
        Phone.add("Samsung");
        Phone.add("Nokia");
        Phone.add("Motorola");
        Phone.add("Iphone");
        System.out.println(Phone);
        for (String s : Phone) {
            System.out.println(s);
        }
    }
}
