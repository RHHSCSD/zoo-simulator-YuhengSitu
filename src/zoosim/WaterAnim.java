/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * WaterAnim Class
 * @author yuhen
 */
public class WaterAnim extends Animal implements ISwimmable {
    private boolean canBreathe;

    /**
     * Constructor of WaterAnim Class
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
     * @param canBreathe   can the animal breathe underwater or not
     */
    public WaterAnim(String name, String species, AnimalSex sex, int age, int positionX, int positionY,
                     AnimalSize size, int speed, int direction, int hunger, int fatigue,
                     Image image, String sound, boolean canBreathe) {
        super(name, species, sex, age, positionX, positionY, size, speed, direction, hunger, fatigue, image, sound);
        this.canBreathe = canBreathe;
    }

    /**
     * Checks if the animal can breathe underwater
     * @return   true if the animal can breathe underwater
     */
    public boolean isCanBreathe() {
        return canBreathe;
    }
    
    /**
     * Determines if the aquatic animal has the ability to surface.
     * @return   true for now, assume that they can all surface
     */
    @Override
    public boolean canSurface() {
        return true;
    }

    /**
     * Returns a string representation(all basic information) of the aquatic animal
     * @return    Breathe capability + superclass information(Basic Information)
     */
    @Override
    public String toString() {
        return "WaterAnim here! {" +
                "canBreathe=" + canBreathe +
                '}' + super.toString();
    }
}
