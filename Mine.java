import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mine extends Obstacles
{
    /**
     * Act - do whatever the Mine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public Mine()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 1570, image.getHeight() - 1570);
        setImage(image);
    }
    public void act() 
    {
      if(isTouching(Dragon.class)){
            GreenfootImage mineExplosion = new GreenfootImage("mineExplosion.png");
            mineExplosion.scale(40, 40);
            setImage(mineExplosion);
            Greenfoot.delay(5);
            getWorld().removeObject(this);
            
        }  
        
    }    
}
