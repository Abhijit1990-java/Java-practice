package MidtermExam;


import java.util.LinkedList;

public class LinkedlistExample {
    public static void main(String[] args) {
        LinkedList<String> Phone = new LinkedList<>();
        Phone.add("Samsung");
        Phone.add("Iphone");
        Phone.add("Nokia");
        Phone.add("Motorola");
        System.out.println(Phone);
        for (int i=0; i<Phone.size(); i++) {
            System.out.println(Phone.getFirst());
            System.out.println(Phone.getLast());
        }

    }
}
