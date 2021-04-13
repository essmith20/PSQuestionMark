import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(2050, 1530, 1); 
        GreenfootSound backgroundMusic = new GreenfootSound("Blazer Rail.wav");
        backgroundMusic.setVolume(50);
        backgroundMusic.playLoop();
        
    }
}
