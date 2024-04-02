/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * LandAnim Class
 * @author yuhen
 */
public class LandAnim extends Animal {

    /**
     * Constructor of LandAnim Class
     * Basic information same as superclass
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
     */
    public LandAnim(String name, String species, AnimalSex sex, int age, int positionX, int positionY,
                    AnimalSize size, int speed, int direction, int hunger, int fatigue,
                    Image image, String sound) {
        super(name, species, sex, age, positionX, positionY, size, speed, direction, hunger, fatigue, image, sound);
    }

    /**
     * Returns a string representation(all basic information) of the LandAnimal.
     * @return    superclass information(Basic Information)
     */
    @Override
    public String toString() {
        return "LandAnim here: " + super.toString();
    }
}
