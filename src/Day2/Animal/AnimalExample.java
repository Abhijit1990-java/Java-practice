package Day2.Animal;

public class AnimalExample {
    private String animalName;
    private double animalNumber;
    private int  animalWeight;

    public AnimalExample() {
        this.animalName = animalName;
        this.animalNumber = animalNumber;
        this.animalWeight = animalWeight;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public double getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(double animalNumber) {
        this.animalNumber = animalNumber;
    }

    public int getAnimalWeight(int i) {
        return animalWeight;
    }

    public void setAnimalWeight(int animalWeight) {
        this.animalWeight = animalWeight;
    }

    @Override
    public String toString() {
        return "AnimalExample{" +
                "animalName='" + animalName + '\'' +
                ", animalNumber=" + animalNumber +
                ",animalWeight=" +animalWeight +
                '}';
    }
}

