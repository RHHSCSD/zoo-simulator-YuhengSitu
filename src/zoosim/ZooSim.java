/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;
/* How would you modify this structure to allow for predator/prey interactions and Carnivores/Omnivores/Herbivores?
1, Define animal species
2, create a feeding interface that defines the diet required for each species of animal
3, create a method for recognizing the relationship between predator and prey, allowing the predator to recognize the prey
*/



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ZooSim Class
 * @author yuhen
 */
public class ZooSim {
    private List<Animal> animals = new ArrayList<>();

    /**
     *
     * @param animal
     */
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    
    /**
     *
     */
    public void displayStatistics() {
        System.out.println("Number of animals in the zoo: " + animals.size());
        System.out.println("Displaying all animals in the zoo");
        for (Animal animal : animals) {
            System.out.println("--------------------------------");
            System.out.println(animal.toString());
            System.out.println("--------------------------------");
        }
    }

    /**
     *
     */
    public void feedAll() {
        for (Animal animal : animals) {
            if (animal.getHunger() >= AnimalConstant.HUNGER_THRESHOLD) {
                animal.eat();
            }
        }
    }

    /**
     *
     */
    public void sleepAll() {
        for (Animal animal : animals) {
            if (animal.getFatigue() >= AnimalConstant.FATIGUE_THRESHOLD) {
                animal.sleep();
            }
        }
    }

    /**
     *
     */
    public void moveAll() {
        for (Animal animal : animals) {
            animal.move();
        }
    }
    
}
