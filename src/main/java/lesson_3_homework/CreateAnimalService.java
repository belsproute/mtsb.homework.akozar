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
            switch (animalType.get(new Random().nextInt(4))){
                case "CAT" :
                    Cat newCat = new Cat(animalName.get(new Random().nextInt(animalName.size())),
                            animalBreed.get(new Random().nextInt(animalBreed.size())),
                            new Random().nextInt(10000),
                            animalChar.get(new Random().nextInt(animalChar.size())));
                    System.out.println("Created Cat " + newCat.getName() + " with a " + newCat.getCharacter() + " character");
                    break;
                case "DOG":
                    Dog newDog = new Dog(animalName.get(new Random().nextInt(animalName.size())),
                            animalBreed.get(new Random().nextInt(animalBreed.size())),
                            new Random().nextInt(10000),
                            animalChar.get(new Random().nextInt(animalChar.size())));
                    System.out.println("Created Dog " + newDog.getName() + " with a " + newDog.getCharacter() + " character");
                    break;
                case "SHARK":
                    Shark newShark = new Shark(animalName.get(new Random().nextInt(animalName.size())),
                            animalBreed.get(new Random().nextInt(animalBreed.size())),
                            new Random().nextInt(10000),
                            animalChar.get(new Random().nextInt(animalChar.size())));
                    System.out.println("Created Shark " + newShark.getName() + " with a " + newShark.getCharacter() + " character");
                    break;
                case "WOLF":
                    Wolf newWolf = new Wolf(animalName.get(new Random().nextInt(animalName.size())),
                            animalBreed.get(new Random().nextInt(animalBreed.size())),
                            new Random().nextInt(10000),
                            animalChar.get(new Random().nextInt(animalChar.size())));
                    System.out.println("Created Wolf " + newWolf.getName() + " with a " + newWolf.getCharacter() + " character");
                    break;
        }
            i++;
        }

        }

    }

