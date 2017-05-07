import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DuplicateCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DuplicateCard extends Actor
{
   public DuplicateCard(){}
    public void act() 
    {
        int mX, mY ;
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo m = Greenfoot.getMouseInfo();  
            mX=m.getX();  
            mY=m.getY();  
            setLocation(mX, mY);  
        } 
        
        // Add your action code here.
    }    
}
