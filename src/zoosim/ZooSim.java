/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;
/**
 * @author Yuheng Situ
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
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
