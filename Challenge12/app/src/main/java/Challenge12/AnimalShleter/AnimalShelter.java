package Challenge12.AnimalShleter;

import java.util.LinkedList;
import java.util.Queue;
public class AnimalShelter {

    Queue<Animal> dogs;
    Queue<Animal> cats;

    public AnimalShelter() {
        dogs = new LinkedList<Animal>();
        cats = new LinkedList<Animal>();

    }

    public Queue<Animal> getDogs() {
        return dogs;
    }

    public Queue<Animal> getCats() {
        return cats;
    }

    public boolean enqueue(Animal animal){

        if(animal.type == "cat"){
            cats.add(animal);
            return true;
        }
        else if(animal.type == "dog"){
            dogs.add(animal);
            return true;
        }
        return false;
    }

    public Animal dequeue(String pref){

        if(pref == "cat"){
            if(cats.isEmpty()){
                System.out.println("The Shleter has no Cats");
                return null;
            }
            cats.remove();
            return cats.peek();
        }
        else if(pref == "dog"){
            if(dogs.isEmpty()){
                System.out.println("The Shleter has no Dogs");
                return null;
            }
            dogs.remove();
            return dogs.peek();
        }
        else
        return null;
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "dogs=" + dogs +
                ", cats=" + cats +
                '}';
    }
}
