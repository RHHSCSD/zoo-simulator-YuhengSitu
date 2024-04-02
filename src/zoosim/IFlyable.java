/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * IFlyable interface
 * @author yuhen
 */
public interface IFlyable {

    /**
     * Makes the BirdAnimal fly
     */
    public void fly();
    
    /**
     * Makes the BirdAnimal land.
     */
    public void land();
    
    /**
     * Checks if the BirdAnimal is currently flying.
     * @return   true if the bird is flying
     */
    public boolean isFlying();
}
