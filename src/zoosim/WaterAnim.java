/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author yuhen
 */
public class WaterAnim extends Animal implements ISwimmable {
    private boolean canBreathe;

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
     * @param canBreathe
     */
    public WaterAnim(String name, String species, AnimalSex sex, int age, int positionX, int positionY,
                     AnimalSize size, int speed, int direction, int hunger, int fatigue,
                     Image image, String sound, boolean canBreathe) {
        super(name, species, sex, age, positionX, positionY, size, speed, direction, hunger, fatigue, image, sound);
        this.canBreathe = canBreathe;
    }

    /**
     *
     * @return
     */
    public boolean isCanBreathe() {
        return canBreathe;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean canSurface() {
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "WaterAnim here! {" +
                "canBreathe=" + canBreathe +
                '}' + super.toString();
    }
}
