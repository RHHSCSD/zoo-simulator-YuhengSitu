/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * IEntity interface
 * @author yuhen
 */
public interface IEntity extends IObject {

    /**
     * Moves the animal to a new position(based on their position, speed and direction)
     */
    void move();

    /**
     * Allow animals to make thier sound
     */
    void makeSound();

    /**
     * feed all hungry animals
     */
    void eat();

    /**
     * make all tired animals sleep
     */
    void sleep();
}
