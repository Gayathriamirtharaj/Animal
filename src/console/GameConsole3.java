package console;
import animal.*;
import wild.*;
import java.util.*;
import wild.AnimalGame;

public class GameConsole3 {
    private static List<Animal> animalList = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        Dog dog = new Dog("Scooby", "Ganesh");
        Cat cat = new Cat("Bella", "Babu");
        WildAnimal lion = new Lion("Leo", "Potter");
        WildAnimal tiger = new Tiger("Felix", "Harry");

        animalList.add(dog);
        animalList.add(cat);
        animalList.add(lion);
        animalList.add(tiger);

        AnimalGame animalGame = new AnimalGame(animalList);

        System.out.println("Listing the animals in alphabetical order");
        animalGame.printAnimalListAlphabetically();

        // Add to Competition
        animalGame.addToSpeakingCompetition(Arrays.asList("Leo", "Bella"));
        animalGame.addToSpeakingCompetition("Felix");

        // Before Competition
        animalGame.printAnimalTypeCountsNotInCompetition();

        // Lastly added Animal must speak first
        animalGame.play();

        // After Competition
        animalGame.printAnimalTypeCountsNotInCompetition();

        // Find with time complexity O(1)
        animalGame.findAnimalByName("Scooby");
        animalGame.findAnimalByName("Cookie");

        // Throw Exception if Animal which is not in the game is added
        animalGame.addToSpeakingCompetition(Arrays.asList("Cookie"));

    }

}

