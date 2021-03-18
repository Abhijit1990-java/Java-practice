package Day2.Animal;

public class Driver extends AnimalExample {

    public Driver(String animalName, String animalNumber,int animalWeight) {
        super();
    }

    public static void main(String[] args) {

        //creating object
        AnimalExample animal1 = new AnimalExample();

        //adding animal1

        animal1.setAnimalName("Pokemon");
        animal1.setAnimalNumber(10);
        animal1.setAnimalWeight(22);

        System.out.println(animal1);

        //creating object
        AnimalExample animal2 = new AnimalExample();

        //adding animal1

        animal2.setAnimalName("CAT");
        animal2.setAnimalNumber(13);
        animal2.setAnimalWeight(20);

        System.out.println(animal2);

        AnimalExample animal3 = new AnimalExample();
        animal3.setAnimalName("Dog");
        animal3.setAnimalNumber(18);
        animal3.setAnimalWeight(15);


    }
}


