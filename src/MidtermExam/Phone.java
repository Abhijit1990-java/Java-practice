package MidtermExam;

public class Phone {
    String name;
    int price;

    public void assignName(String n, int p){
        name = n;
        price = p;

    }
    public void displayInfo(){
        System.out.println("MidtermExam.Phone name is:" +name);
        System.out.println("MidtermExam.Phone price is:" +price);
    }
    public static void main(String[] args) {
        Phone Phone1 = new Phone();
        Phone1.assignName("samsung", 90000);
        Phone1.displayInfo();
        Phone Phone2 = new Phone();
        Phone2.assignName("Iphone", 80000);
        Phone2.displayInfo();
        Phone Phone3 = new Phone();
        Phone3.assignName("Lava",10000);
        Phone3.displayInfo();


    }
}