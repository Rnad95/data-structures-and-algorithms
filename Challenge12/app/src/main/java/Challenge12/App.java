/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge12;

import Challenge12.AnimalShleter.Animal;
import Challenge12.AnimalShleter.AnimalShelter;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        AnimalShelter animal = new AnimalShelter();
        Animal dog = new Animal("dog","bulldog, age:14 ","20/3/2022");
        animal.enqueue(dog);
        Animal dog1 = new Animal("dog","black-and-tan Pomeranian","2000");
        animal.enqueue(dog1);
        Animal cat = new Animal("cat","himalayan","20/1/2022");
        animal.enqueue(cat);
        System.out.println(animal);

    }


}
