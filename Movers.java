import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Movers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movers extends Actor
{
    /**
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    public void moveAndTurn()
    {
        if(Greenfoot.isKeyDown("D"))
        {
            setRotation(0);
            move(1);
        }
        if(Greenfoot.isKeyDown("A"))
        {
            setRotation(180);
            move(1);
        }
        if(Greenfoot.isKeyDown("W"))
        {
            setRotation(270);
            move(1);
        }
        if(Greenfoot.isKeyDown("S"))
        {
            setRotation(90);
            move(1);
        }
        
    }
    public void slideAround()
    {
        int x = getX();
        int y = getY();
        
        if(Greenfoot.isKeyDown("D"))
        {
            setLocation(x + 2, y);
            if(hitWalls())
            {
                setLocation(x - 2, y);
            }
        }
        if(Greenfoot.isKeyDown("A"))
        {
            setLocation(x - 2, y);
            if(hitWalls())
            {
                setLocation(x + 2, y);
            }
        }
        if(Greenfoot.isKeyDown("W"))
        {
            setLocation(x, y - 2);
            if(hitWalls())
            {
                setLocation(x, y + 2);
            }
        }
        if(Greenfoot.isKeyDown("S"))
        {
            setLocation(x, y + 2);
            if(hitWalls())
            {
                setLocation(x, y - 2);
            }
        }
    }
    public boolean hitWalls()
    {
       if (isTouching(walls.class))
       {
           return true;
       }
       else
       {
           return false;
       }
    }
}
