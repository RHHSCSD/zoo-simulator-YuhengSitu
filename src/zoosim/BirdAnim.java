/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * BirdAnim Class
 * @author yuhen
 */
public class BirdAnim extends Animal implements IFlyable{
    private boolean canFly;
    private boolean isFlyingOrNot;

    /**
     * Constructor of BirdAnim Class
     * @param name
     * @param species
     * @param sex
     * @param age
     * @param positionX
     * @param positionY
     * @param size
     * @param speed
     * @param direction
     * @param hunger
     * @param fatigue
     * @param image
     * @param sound
     * @param canFly    defind the animal can fly or not
     */
    public BirdAnim(String name, String species, AnimalSex sex, int age, int positionX, int positionY,
                    AnimalSize size, int speed, int direction, int hunger, int fatigue,
                    Image image, String sound, boolean canFly) {
        super(name, species, sex, age, positionX, positionY, size, speed, direction, hunger, fatigue, image, sound);
        this.canFly = canFly;
    }

    /**
     * Checks if the animal can fly
     * @return   true if the bird can fly, false otherwise.
     */
    public boolean isCanFly() {
        return canFly;
    }
    
    /**
     * Makes the BirdAnimal fly
     */
    @Override
    public void fly() {
        isFlyingOrNot = true;
        System.out.println(getName() + " is flying.");
    }
    
    /**
     * Makes the BirdAnimal land.
     */
    @Override
    public void land() {
        isFlyingOrNot = false;
        System.out.println(getName() + " lands.");
    }

    /**
     * Checks if the BirdAnimal is currently flying.
     * @return   true if the bird is flying
     */ 
    @Override
    public boolean isFlying() {
        return isFlyingOrNot;
    }

    /**
     * Returns a string representation(all basic information) of the BirdAnimal.
     * @return   flying capability + superclass information(Basic Information)
     */
    @Override
    public String toString() {
        return "BirdAnim here! {" +
                "canFly=" + canFly +
                '}' + super.toString();
    }
}
