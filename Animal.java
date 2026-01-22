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
      numAnimals++;
   }

    // Write a constructor that takes an animal type parameter
   public Animal(String animal) {
      animalType = animal;
      numAnimals++;
   }

    // Create a getter/accessor method that returns the static variable that counts how many
    // animals have been instatiated
   public static int getNumAnimals() {
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
      if (animalType.equals("cow")) {
         return "moo";
      } else if (animalType.equals("horse")) {
         return "neigh";
      } else if (animalType.equals("pig")) {
         return "oink";
      } else if (animalType.equals("lion")) {
         return "roar";
      } else {
         return "bark";
      }
   }

    // Create the speakBackward() method that calls speak() and returns the reversed String
   public String speakBackward() {
      String animalSound = speak();
      String backwardSound = "";
      for (int i = animalSound.length() - 1; i >= 0; i--) {
         backwardSound += animalSound.substring(i, i + 1);
      } 
      return backwardSound;
   }

    // Create the toString() method which returns friendly description of the animal
   public String toString() {
      return "\n Animal sound is " + speak() + "\n Animal sound backward is " + speakBackward();
   }
    // Create a static method called "randomAnimalType" that returns a random
    // animale type
    // HINT: Decide how many animal types you want to be able to create, pick a random number
    // and then use if/else/if statements to determine what the animal should say
   public static String randomAnimalType() {
      int randomNumber = (int) (Math.random() * 5);
      if (randomNumber > 4) {
         return "cow";
      } else if (randomNumber > 3) {
         return "horse";
      } else if (randomNumber > 2) {
         return "pig";
      } else if (randomNumber > 1) {
         return "lion";
      } else {
         return "dog";
      }
   }
}