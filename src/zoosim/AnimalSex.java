/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * AnimalSex Class
 * It's just a framework to make things easier for future development, can be directly replaced by a String for now.
 * @author yuhen
 */
public class AnimalSex {
    private String sex;
    
    /**
     * Constructor of AnimalSex Class, Define the sex of the animal
     * @param sex sex of the animal(Male/Female)
     */
    public AnimalSex(String sex) {
        this.sex = sex;
    }
    
    /**
     * get the sex of the animal
     * @return   the sex of the animal
     */
    public String getSex() {
        return sex;
    }
}
