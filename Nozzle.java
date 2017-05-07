import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Nozzle extends Actor{
    
    int nozzleType;
    static GreenfootImage[] images = {new GreenfootImage("red-nozzle.png"), new GreenfootImage("yellow-nozzle.png")}; 
    int mX, mY ;
    public Nozzle(int type){
        nozzleType=type;
        setImage(images[type]); 
    }
    
    public void act() {
              
    }    
    
    
}
