import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spikeTrap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spikeTrap extends Obstacles
{
    /**
     * Act - do whatever the spikeTrap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 1;
    GreenfootImage spikeDown = new GreenfootImage("peaks_3.png");
    GreenfootImage spikeUp = new GreenfootImage("peaks_1.png");
    public void act() 
    {
        if (timer % 100 == 0){
            setImage(spikeUp);
            //if(isTouching(dragon.class || enemy.class)){
            //dragonHealth = // takes health from dragon
            //enemyHealth = // takes health from enemy
            //}
            timer++;
                
        }
        else{
           setImage(spikeDown); 
           timer++;
        }
    }    
}
