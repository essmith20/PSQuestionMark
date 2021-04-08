import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class title_screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class title_screen extends Actor
{
    public static void main(String[] args){Scanner scnr = new Scanner(System.in);
        char userCh;
        boolean isPlaying = false;
        userCh = scnr.next().charAt(0);
        while (!isPlaying){if (userCh == 'a'){
            System.out.println("The Game begins");
            isPlaying = true;}
            else{System.out.println("Press 'a' to start");}
            
        
        
    }
}

    
    
    
    
}


