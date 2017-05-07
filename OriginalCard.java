import greenfoot.*;  

public class OriginalCard extends Actor 
{ 
    public OriginalCard(){}
    public void act() 
    {
        int mX, mY ;
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo m = Greenfoot.getMouseInfo();  
            mX=m.getX();  
            mY=m.getY();  
            setLocation(mX, mY);  
        } 
    }    
}
