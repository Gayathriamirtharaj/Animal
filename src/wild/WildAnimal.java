package wild;

import animal.Playable;
import animal.Animal;

public abstract class WildAnimal extends Animal implements Playable {

    public WildAnimal(String animal,String owner,Integer noOfLegs,String type){
        super(animal,owner,noOfLegs,type);
    }

    public void tame(){
        System.out.println("TAMED : I am " + name + ". A " + noOfLegs + " legged " + type);
    }
}
