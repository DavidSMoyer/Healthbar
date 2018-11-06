import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public HealthBar health = new HealthBar(1500,2400,24);
    private Button addHealth = new Button(Color.GREEN,50);
    private Button removeHealth = new Button(Color.RED,80);
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        addObject(health, getWidth()/2, getHeight()/2 );
        addObject(addHealth, getWidth()/2 - 200, getHeight()/2 + 100 );
        addObject(removeHealth, getWidth()/2 + 200, getHeight()/2 + 100);
    }
}
