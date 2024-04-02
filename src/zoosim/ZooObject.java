/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author yuhen
 */
public class ZooObject implements IObject {
    private String zooObjectType;//food, rock, tree
    private int positionX;
    private int positionY;
    private String size;//Small, Median, Large

    /**
     *
     * @param zooObjectType
     * @param positionX
     * @param positionY
     * @param size
     */
    public ZooObject(String zooObjectType, int positionX, int positionY, String size) {
        this.zooObjectType = zooObjectType;
        this.positionX = positionX;
        this.positionY = positionY;
        this.size = size;
    }
    
    /**
     *
     * @param degrees
     */
    @Override
    public void turn(double degrees) {
        System.out.println("Zoo object turns " + degrees + " degrees.");
    }
    
    /**
     *
     * @param x
     * @param y
     */
    @Override
    public void place(int x, int y) {
        positionX = x;
        positionY = y;
        System.out.println("Zoo object is placed at position (" + x + ", " + y + ").");
    }
}
