package lesson_3_homework;

public class PetInheritance {

    public static void main(String[] args) {

        Cat cat = new Cat("Мурка", "Британская", 1000.3, "Спокойная");
        cat.setPetFood("Вискас");

        System.out.println("Создана кошка: " + cat.getName() + ", питается: " + cat.getPetFood());

        Wolf wolf = new Wolf("Балто", "Волчара", 432942.5, "Мощны его лапищи");
        wolf.setPrey("Кволики");

        System.out.println("Создан волк: " + wolf.getName() + ", питается: " + wolf.getPrey());
    }



}
