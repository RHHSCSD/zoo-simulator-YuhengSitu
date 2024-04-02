/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author yuhen
 */
public class BirdAnim extends Animal implements IFlyable{
    private boolean canFly;
    private boolean isFlyingOrNot;

    /**
     *
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
     * @param canFly
     */
    public BirdAnim(String name, String species, AnimalSex sex, int age, int positionX, int positionY,
                    AnimalSize size, int speed, int direction, int hunger, int fatigue,
                    Image image, String sound, boolean canFly) {
        super(name, species, sex, age, positionX, positionY, size, speed, direction, hunger, fatigue, image, sound);
        this.canFly = canFly;
    }

    /**
     *
     * @return
     */
    public boolean isCanFly() {
        return canFly;
    }
    
    /**
     *
     */
    @Override
    public void fly() {
        isFlyingOrNot = true;
        System.out.println(getName() + " is flying.");
    }
    
    /**
     *
     */
    @Override
    public void land() {
        isFlyingOrNot = false;
        System.out.println(getName() + " lands.");
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isFlying() {
        return isFlyingOrNot;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "BirdAnim here! {" +
                "canFly=" + canFly +
                '}' + super.toString();
    }
}
