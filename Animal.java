import java.util.Random;

public class Animal {

    // creat a private instance variable to store the animal type (e.g. "Tiger" or "Bear" or any other type of animal)
   private String animalType;
    // create Static/class variable to track how many Animal objects have been created
   private static int numAnimals;
    // No-argument constructor:
    // - Creates a random animal type using the randomAnimalType() method you should write in this class
   public Animal() {
      animalType = randomAnimalType();
   }

    // Write a constructor that takes an animal type parameter
   public Animal(String animal) {
      animalType = animal;
   }

    // Create a getter/accessor method that returns the static variable that counts how many
    // animals have been instatiated
   public int getNumAnimals() {
      return numAnimals;
   }

    // Create a getter/accessor method for returning the animal type
   public String getAnimalType() {
      return animalType;
   }
    // Create a getter/ accessor method for updating the animal type
   public String changeAnimalType(String newAnimal) { 
      return animalType = newAnimal;
   }
    // Creat a speak() method that uses the animal type and returns
    // a sound based on the animal type. You can just return a String with the animal noise
   public String speak() {
      if (animalType.equals("Cow")) {
         return "moo";
      } else if (animalType.equals("Horse")) {
         return "neigh";
      } else if (animalType.equals("Pig")) {
         return "oink";
      } else if (animalType.equals("Cat")) {
         return "meow";
      } else {
         return "bark";
      }
   }

    // Create the speakBackward() method that calls speak() and returns the reversed String
 /*  public String speakBackward() {
      String animalSound = Animal.speak();
      String backwardSound;
      for (int i = 0; i < animalSound.length(); i++) {
      
      }
      return backwardSound;
   }
*/
    // Create the toString() method which returns friendly description of the animal
   public String toString() {
      return "";
   }
    // Create a static method called "randomAnimalType" that returns a random
    // animale type
    // HINT: Decide how many animal types you want to be able to create, pick a random number
    // and then use if/else/if statements to determine what the animal should say
   public static String randomAnimalType() {
      int randomNumber = (int) (Math.random() * 5);
      if (randomNumber > 4) {
         return "Cow";
      } else if (randomNumber > 3) {
         return "Horse";
      } else if (randomNumber > 2) {
         return "Pig";
      } else if (randomNumber > 1) {
         return "Cat";
      } else {
         return "Dog";
      }
   }
   public static void main(String[] args) {

   }
}  
  
