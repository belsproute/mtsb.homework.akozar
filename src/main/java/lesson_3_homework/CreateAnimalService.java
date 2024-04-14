package lesson_3_homework;

import java.util.List;
import java.util.Random;

public interface CreateAnimalService {

     int ANIMALS_COUNTER = 10;
     List<String> animalType = List.of("CAT","DOG","SHARK","WOLF");
     List<String> animalName = List.of("Zoey","Garry","Lindsey","Kevin", "Tomas", "Sarah", "Elliot", "Misty", "V");
     List<String> animalChar = List.of("Nice","Angry","Bad","Lovely", "Sweet", "Aggressive");
     List<String> animalBreed= List.of("1","2","3","4","5","6");
    default void createAnimal(){

        int i = 0;
        List<String> animalType = List.of("CAT","DOG","SHARK","WOLF");

        while (i < ANIMALS_COUNTER)
        {
            switch (animalType.get(new Random(4).nextInt())){
                case "CAT" :
                    System.out.println(new Cat("1", "1", 100f, "1"));
                    break;
                case "DOG":
                    System.out.println(new Dog("2", "2", 100f, "2"));
                    break;
                case "SHARK":
                    System.out.println(new Shark("3", "3", 100f, "3"));
                    break;
                case "WOLF":
                    System.out.println(new Wolf("4", "4", 100f, "4"));
                    break;
        }
            i++;
        }

        }

    }

