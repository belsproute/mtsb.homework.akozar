package lesson_3_homework;


import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService{
   public void createAnimal(int N) { // перегруженный метод

      for(int i = 0;i < N; i++)
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
      }
   }



   public void createAnimal() { // переопределенный метод
      int i = 0;
      //List<String> animalType = List.of("CAT","DOG","SHARK","WOLF");

      do
      {  switch (animalType.get(new Random().nextInt(4))){
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
      } while (i < ANIMALS_COUNTER);
   }

   public static void main(String[] args) {

      CreateAnimalServiceImpl createdAnimal = new CreateAnimalServiceImpl();



      createdAnimal.createAnimal();
      System.out.println("__________________________________________________");
      createdAnimal.createAnimal(5);

   }

}
