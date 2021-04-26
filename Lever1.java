import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lever1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lever1 extends Obstacles
{
    /**
     * Act - do whatever the Lever1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage leverOn = new GreenfootImage("leverOn.png");
    GreenfootImage howTo = new GreenfootImage("Press z to turn the lever on", 10, Color.BLACK, Color.WHITE);
    public void act() 
    {
        MyWorld map = (MyWorld) getWorld();
        Dragon dragon = map.getDragon();
        if (getObjectsInRange(5, Dragon.class) != null){
            setImage(howTo);
            if (Greenfoot.isKeyDown("z") == true) {
                setImage(leverOn);
                
            }
        else{
            setImage("leverOff.png");
        }
        }
        
    }  
    
}
