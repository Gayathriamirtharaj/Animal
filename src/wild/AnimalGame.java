package wild;

import animal.Animal;
import java.util.*;

    public class AnimalGame {


        Set<String> competition;
        ArrayList<String> animalname;
        TreeMap<String,String>animalMap;

        public AnimalGame(List<Animal> animalList){
          animalMap = new TreeMap<>();
            competition = new HashSet<>();
            for(Animal animal : animalList){
                animalMap.put(animal.getName(),animal.getType());
            }
            animalname = new ArrayList<>();
        }
        public void printAnimalListAlphabetically(){
            for(Map.Entry<String,String> animalsname : animalMap.entrySet()){
                System.out.println(animalsname.getKey() + " : " + animalsname.getValue());
            }
        }

        public void addToSpeakingCompetition(String name){
            animalname.add(name);
            this.competition.add(name);
        }

        public void addToSpeakingCompetition(List<String> competition) throws Exception{
            for(String name : competition){
                if(animalMap.containsKey(name) == false)
                    throw new Exception("Only Animals included in the Game can be added to Competition!");
                animalname.add(name);
                this.competition.add(name);
            }
        }


        public void printAnimalTypeCountsNotInCompetition(){
            Set<String> animals = animalMap.keySet();
            for(String cubs : animals){
                if(competition.contains(cubs) == false){
                    System.out.println(animalMap.get(cubs) + " : " + 1);
                }
                else {
                    System.out.println(animalMap.get(cubs) + " : " + 0);
                }
            }
        }

        public void play(){
            int size = animalname.size();
            for(int i = 0 ; i <size ; i++){
                if(animalMap.get(animalname.get(i)).equals("Cat"))
                    System.out.println(animalname.get(i) + ":" + " I am a cat and am meowing!");
                else if(animalMap.get(animalname.get(i)).equals("Lion"))
                    System.out.println(animalname.get(i) + ":" + " I am a lion and am roaring!");
                else if(animalMap.get(animalname.get(i)).equals("Tiger"))
                    System.out.println(animalname.get(i) + ":" + " I am a tiger and am roaring!");
                else
                    System.out.println(animalname.get(i) + ":" + " I am a dog and am barking!");
            }
        }



        public void findAnimalByName(String name){
            System.out.println("Finding the animal by name");
            if(animalMap.containsKey(name) == false)
                System.out.println(name + " not found.");
            else
                System.out.println(name + " found");
        }

    }

