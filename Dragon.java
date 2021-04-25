import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dragon extends Movers
{
    /**
     * Act - do whatever the Dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Dragon()
    {
    GreenfootImage Dragon = getImage();
    Dragon.scale(Dragon.getWidth()-25, Dragon.getHeight()-25);
    setImage(Dragon);
}
    public void act() 
    {
      moveAndTurn();
      slideAround();
    }    
    
    public void move(){
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("W")) y--;
        if(Greenfoot.isKeyDown("S")) y++;
        if(Greenfoot.isKeyDown("A")) x--;
        if(Greenfoot.isKeyDown("D")) x++;
        setLocation(x, y);
    }
}
