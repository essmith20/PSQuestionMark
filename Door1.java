import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door1 extends Obstacles
{
    /**
     * Act - do whatever the Door1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage doorOpen = new GreenfootImage("doorOpen.png");

    public void act() 
    {
        if (Greenfoot.isKeyDown("z") == true) {
            setImage(doorOpen);
        }
    }
}

