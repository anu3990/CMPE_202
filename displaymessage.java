import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class displaymessage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class displaymessage extends Actor
{
    /**
     * Act - do whatever the displaymessage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public displaymessage(String message){
       setImage(new GreenfootImage(message,25,greenfoot.Color.RED,greenfoot.Color.WHITE,greenfoot.Color.BLACK));
    }
}
