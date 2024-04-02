/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * Animal Class
 * @author yuhen
 */
public class Animal implements IEntity {
    private static int idCounter = 0;
    private int id;
    private String name;
    private String species;
    private AnimalSex sex;
    private int age;
    private int positionX;
    private int positionY;
    private AnimalSize size;
    private int speed;
    private double direction;
    private int hunger;
    private int fatigue;
    private Image image;
    private String sound = "AAAAAAAA(default sound)";
    
    /**
     * Constructor of Animal Class
     * @param name
     * @param species
     * @param sex  Male/Female
     * @param age
     * @param positionX
     * @param positionY
     * @param size  Small/Median/Large
     * @param speed
     * @param direction
     * @param hunger
     * @param fatigue
     * @param image
     * @param sound
     */
    public Animal(String name, String species, AnimalSex sex, int age, int positionX, int positionY,
                  AnimalSize size, int speed, int direction, int hunger, int fatigue, Image image, String sound) {
        this.id = idCounter++;
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.positionX = positionX;
        this.positionY = positionY;
        this.size = size;
        this.speed = speed;
        this.direction = direction;
        this.hunger = hunger;
        this.fatigue = fatigue;
        this.image = image;
        this.sound = sound;
    }
    
    /**
     * Allow animals to make thier sound
     */
    @Override
    public void makeSound() {
        System.out.println(name + " makes a default animal sound: " + sound);
    }
    
    /**
     * Place animals to a given position
     * @param x    position at X
     * @param y    position at Y
     */
    @Override
    public void place(int x, int y) {
        positionX = x;
        positionY = y;
        System.out.println(name + " is placed at position (" + x + ", " + y + ").");
    }
    
    /**
     * Allow animals to move (based on their position, speed and direction)
     */
    @Override
    public void move() {
        boolean cannotMove = false;
        if (fatigue >= AnimalConstant.FATIGUE_THRESHOLD) {
            System.out.println(name + " " + id + " is fatigued.");
            cannotMove = true;
        }
        if (hunger >= AnimalConstant.HUNGER_THRESHOLD) {
            System.out.println(name + " " + id + " is hungry.");
            cannotMove = true;
        }
        if (cannotMove) {
            System.out.println(name + " " + id + " is either hungry or fatigued, cannot move.");
            return;
        }
        double radians = Math.toRadians(direction);
        int deltaX = (int) (Math.cos(radians) * speed);
        int deltaY = (int) (Math.sin(radians) * speed);
        positionX += deltaX;
        positionY += deltaY;
        fatigue += speed;
        hunger += speed;
        System.out.println(name + " moved to position (" + positionX + ", " + positionY + ").");
    }
    
    /**
     *
     */
    @Override
    public void eat() {
        hunger = 0;
        System.out.println(name + " is eating, hunger reset to 0.");
    }
    
    /**
     *
     */
    @Override
    public void sleep() {
        fatigue = 0;
        System.out.println(name + " is sleeping, fatigue reset to 0.");
    }
    
    /**
     * Allow animals to trun direction
     * @param degrees
     */
    @Override
    public void turn(double degrees) {
        direction = (direction + degrees) % 360;
        System.out.println(name + " turning clockwise" + degrees + " degrees.");
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                ", size='" + size + '\'' +
                ", speed='" + speed + '\'' +
                ", direction=" + direction +
                ", hunger=" + hunger +
                ", fatigue=" + fatigue +
                ", image=" + image +
                ", sound='" + sound + '\'' +
                '}';
    }
    
    // Some Getters and Setters

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }
    
    /**
     *
     * @return
     */
    public int getHunger() {
        return hunger;
    }

    /**
     *
     * @return
     */
    public int getFatigue() {
        return fatigue;
    }
    //...................
}
