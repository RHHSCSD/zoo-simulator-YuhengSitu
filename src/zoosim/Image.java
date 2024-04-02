/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * Image Class
 * @author yuheng
 */
public class Image {
    private int width;
    private int height;
    
    /**
     * Constructor of Image Class
     * Creates an Image object with the specified width and height
     * @param width    The width of the image in pixels(Must be a positive integer)
     * @param height    The height of the image in pixels(Must be a positive integer)
     */
    public Image(int width, int height){
        this.width = width;
        this.height = height;
    }
}
