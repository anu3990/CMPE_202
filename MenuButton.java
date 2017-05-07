import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class MenuButton extends Actor 
{
    int id;
    
    public MenuButton(int id) {
        this.id=id;
    }
    
    
    public void act() 
    {
        
            GasPumpWorld obj = (GasPumpWorld)this.getWorld();
            String state = obj.getState().getMessage().toString();
            displaymessage d  = new displaymessage("");
             List objects = getWorld().getObjects(displaymessage.class);
            if (Greenfoot.mouseClicked(this)) {
                /*if(this.id!=3){
                    switch(state){
                        case "advt":
						
                        case "one":
                        case "two":
                        case "three":
                        case "four":Greenfoot.playSound("beep.wav");
                                    break;
                                    case "active": break; //write code
                
                               }
                            }
                            else
                            obj.setState(new StateAdvt(obj));*/
                            
            if(state.equalsIgnoreCase("active") && this.id == 7){
                obj.setState(new FuelSelection(obj));
                
            }
            
            else if(state.equalsIgnoreCase("fuelSelection") && this.id == 7){
                obj.setState(new RedFuel(obj));
                
                
            }
            
           else if(state.equalsIgnoreCase("fuelSelection") && this.id == 3){
                obj.setState(new YellowFuel(obj));
                
                
            }
            else if(state.equalsIgnoreCase("active") && this.id == 3){
                obj.setState(new Cancel(obj));
                
                
            }
            else if((state.equalsIgnoreCase("redFuel")|| state.equalsIgnoreCase("yellowFuel")) && this.id == 7){
                obj.setState(new FuelSelection(obj));
                
                
            }
            
                
            }
    }    
}
