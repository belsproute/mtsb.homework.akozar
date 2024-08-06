package lesson_3_homework;

public class Pet extends AbstractAnimal {
    private String petFood;
    public void setPetFood(String petFood) {
        this.petFood = petFood;
    }
    public String getPetFood() {
        return petFood;
    }
    public Pet(String name, String breed, double cost, String character) {
        setName(name);
        setBreed(breed);
        setCost(cost);
        setCharacter(character);

    }
}

