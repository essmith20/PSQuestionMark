import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ArrowTrap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrowTrap extends Obstacles
{
    /**
     * Act - do whatever the ArrowTrap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   private int timer = 0;
   private int check = 2;
   public void act() 
    {
        timer++;
        timer++;
        if (timer % check == 0){
            timer++;
            if(hitWalls()){
                getImage().setTransparency(0);
                setLocation(getX(), getY());
                getImage().setTransparency(255);
            }
            else{
                setLocation(getX(), getY()+5);
            }
            //if(isTouching(dragon.class || enemy.class)){
            //dragonHealth = // takes health from dragon
            //enemyHealth = // takes health from enemy
            //}
        }
        else{
           timer++; 
        }
   }
   
}
