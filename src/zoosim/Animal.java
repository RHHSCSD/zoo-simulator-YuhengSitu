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
     * @param name  Name of the animal
     * @param species  species of the animal
     * @param sex  sex of the animal(Male/Female)
     * @param age  age of the animal
     * @param positionX  positionX of the animal
     * @param positionY  positionY of the animal
     * @param size  size of the animal(Small/Median/Large)
     * @param speed  speed of the animal
     * @param direction  direction of the animal
     * @param hunger  hunger of the animal
     * @param fatigue  fatigue of the animal
     * @param image  image of the animal
     * @param sound  sound of the animal
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
     * Moves the animal to a new position(based on their position, speed and direction)
     */
    @Override
    public void move() {
        boolean cannotMove = false;
        // Check if the animal is too fatigued to move
        if (fatigue >= AnimalConstant.FATIGUE_THRESHOLD) {
            System.out.println(name + " " + id + " is fatigued.");
            cannotMove = true;
        }
        // Check if the animal is too hungry to move
        if (hunger >= AnimalConstant.HUNGER_THRESHOLD) {
            System.out.println(name + " " + id + " is hungry.");
            cannotMove = true;
        }
        // If the animal is either hungry or fatigued, it cannot move
        if (cannotMove) {
            System.out.println(name + " " + id + " is either hungry or fatigued, cannot move.");
            return;
        }
        // Calculate the movement in the X and Y directions based on the animal's direction and speed by using math cos and sin
        double radians = Math.toRadians(direction);
        int deltaX = (int) (Math.cos(radians) * speed);
        int deltaY = (int) (Math.sin(radians) * speed);
        positionX += deltaX;
        positionY += deltaY;
        // Increase the fatigue and hunger as the animal moves
        fatigue += speed;
        hunger += speed;
        System.out.println(name + " moved to position (" + positionX + ", " + positionY + ").");
    }
    
    /**
     * feed all hungry animals
     */
    @Override
    public void eat() {
        hunger = 0;
        System.out.println(name + " is eating, hunger reset to 0.");
    }
    
    /**
     * make all tired animals sleep
     */
    @Override
    public void sleep() {
        fatigue = 0;
        System.out.println(name + " is sleeping, fatigue reset to 0.");
    }
    
    /**
     * Allow animals to trun direction
     * @param degrees   turning  degrees
     */
    @Override
    public void turn(double degrees) {
        direction = (direction + degrees) % 360;
        System.out.println(name + " turning clockwise" + degrees + " degrees.");
    }
    
    /**
     * Override the toString method, return a string representation(all information) of the animal.
     * @return   all basic information of the animal
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
     * get ID of the animal
     * @return   ID of the animal
     */
    public int getId() {
        return id;
    }

    /**
     * get Name of the animal
     * @return   Name of the animal
     */
    public String getName() {
        return name;
    }
    
    /**
     * get Hunger of the animal
     * @return   Hunger of the animal
     */
    public int getHunger() {
        return hunger;
    }

    /**
     * get Fatigue of the animal
     * @return   Fatigue of the animal
     */
    public int getFatigue() {
        return fatigue;
    }
    //...................
}
