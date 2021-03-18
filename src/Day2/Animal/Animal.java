package Day2.Animal;

public class Animal {
    private String animalName;
    private int animalAge;
    private int animalWeight;


    public Animal(String animalName, int animalAge, int animalWeight) {
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.animalWeight = animalWeight;
    }

    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public int getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(int animalWeight) {
        this.animalWeight = animalWeight;
    }

    public static void main(String[] args) {



    }
}


