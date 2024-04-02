/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * AnimalSize Class
 * It's just a framework to make things easier for future development, can be directly replaced by a String for now.
 * @author yuhen
 */
public class AnimalSize {
    private String size;//Small, Median, Large
    
    /**
     * Constructor of AnimalSize Class, Define the size of the animal
     * @param size   size of the animal(Small/Median/Large)
     */
    public AnimalSize(String size) {
        this.size = size;
    }

    /**
     * get size of the animal
     * @return   size of the animal
     */
    public String getSize() {
        return size;
    }
}
