/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * IObject interface
 * @author yuhen
 */
public interface IObject {

    /**
     * Allow animals to trun direction
     * @param degrees    turning  degrees
     */
    public void turn(double degrees);
    
    /**
     * Place animals to a given position
     * @param x   position at X
     * @param y   position at Y
     */
    public void place(int x, int y);
}
