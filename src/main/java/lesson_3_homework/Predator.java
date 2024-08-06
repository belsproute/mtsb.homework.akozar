package lesson_3_homework;

public class Predator extends AbstractAnimal {
    protected String prey;
    public void setPrey(String prey) {
        this.prey = prey;
    }

    public String getPrey() {
        return prey;
    }

    public Predator(String name, String breed, double cost, String character) {
        setName(name);
        setBreed(breed);
        setCost(cost);
        setCharacter(character);
    }

}