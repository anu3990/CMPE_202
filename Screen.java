import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen extends Actor 
{
    /**
     * Act - do whatever the Screen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        GasPumpWorld obj = (GasPumpWorld)this.getWorld();
        String state = obj.getState().getMessage().toString();
        displaymessage d  = new displaymessage("");
        List objects = getWorld().getObjects(displaymessage.class);
        int mX, mY ;
        switch(state){
            
            case "advt":  
                          d = new displaymessage("Welcome !!!");
                           getWorld().addObject(d,350,100);  
                           d = new displaymessage("Please Swipe Your Card");
                          getWorld().addObject(d,350,200);  
                          break;
            case "cardInserted": obj.removeObjects(objects);
                         d = new displaymessage("Credit card scan was succcessful.");
                         getWorld().addObject(d,350,100);
                         d = new displaymessage("Enter your Zip code\n\n _ _ _ _ _");
                         getWorld().addObject(d,350,200);  
                                                    
                          break;
            case "one":  
                          d = new displaymessage("Enter your Zip code\n\n * _ _ _ _");
                          getWorld().addObject(d,350,200);  
                          break;
                        
            case "two":   d = new displaymessage("Enter your Zip code\n\n * * _ _ _");
                          getWorld().addObject(d,350,200);  
                          break;
           
            case "three": d = new displaymessage("Enter your Zip code\n\n * * * _ _");
                          getWorld().addObject(d,350,200);  
                          break;
                        
            case "four":  
                          d = new displaymessage("Enter your Zip code\n\n * * * * _");
                          getWorld().addObject(d,350,200);  
                          break;
                        
            case "active": d = new displaymessage("Enter your Zip code\n\n * * * * *");
                          getWorld().addObject(d,350,200);
                           d = new displaymessage("Continue");
                           getWorld().addObject(d,230,280);  
                           d = new displaymessage("Cancel");
                           getWorld().addObject(d,480,280); 
                           break;
             case "fuelSelection": obj.removeObjects(objects);
                         d = new displaymessage("Please Select Fuel Type");
                          getWorld().addObject(d,350,100);
                          d = new displaymessage("Red");
                           getWorld().addObject(d,230,280);  
                           d = new displaymessage("Yellow");
                           getWorld().addObject(d,480,280); 
                           break;
             case "redFuel" :  obj.removeObjects(objects);   
                                d = new displaymessage("Please Remove Red Nozzle to fill fuel");
                          getWorld().addObject(d,350,100);
                         d = new displaymessage("Back");
                           getWorld().addObject(d,230,280);  
                          break;
             case "yellowFuel" :  obj.removeObjects(objects);   
                                d = new displaymessage("Please Remove Yellow Nozzle to fill fuel");
                          getWorld().addObject(d,350,100);
                          d = new displaymessage("Back");
                           getWorld().addObject(d,230,280);  
                          break;
                          
              case "cancel" :  Greenfoot.setWorld(new GasPumpWorld());
                          break;
            
        }
        
    
    
    }    
}
