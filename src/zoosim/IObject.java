/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 *
 * @author yuhen
 */
public interface IObject {

    /**
     *
     * @param degrees
     */
    public void turn(double degrees);
    
    /**
     *
     * @param x
     * @param y
     */
    public void place(int x, int y);
}
