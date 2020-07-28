package console;
import animal.*;
import music.*;
import java.util.*;

public class GameConsole1 {

        private static List<Playable> playableList = new ArrayList<>();

        public static void makeAllPlay() {
            playableList.forEach((playable) -> playable.play());
        }

        public static void main(String[] args) {

            Dog dog = new Dog("Scooby", "Ganesh");
            Cat cat = new Cat("Bella", "Babu");
            MusicPlayer musicPlayer = new MusicPlayer(new String[]{
                    "alpha.mp3",
                    "beta.mp3",
                    "gamma.mp3"
            });

            playableList.add(dog);
            playableList.add(cat);
            playableList.add(musicPlayer);

            makeAllPlay();

        }
    }

