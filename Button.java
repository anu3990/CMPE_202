import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
        
        static GreenfootImage[] images = {new GreenfootImage("Zero.png"), 
                                          new GreenfootImage("one.png"),
                                          new GreenfootImage("two.png"),
                                          new GreenfootImage("three.png"),
                                          new GreenfootImage("four.png"),
                                          new GreenfootImage("five.png"),
                                          new GreenfootImage("six.png"),
                                          new GreenfootImage("seven.png"),
                                          new GreenfootImage("eight.png"),
                                          new GreenfootImage("Nine.png"),
                                          new GreenfootImage("Star.png"),
                                          new GreenfootImage("Hash.png"),
                                          new GreenfootImage("yes.png"),
                                          new GreenfootImage("No.png"),
                                          new GreenfootImage("Help.png"),
                                          new GreenfootImage("Cancel.png")                                           
                                        }; 
        int id;
        public Button(int id){
            this.id=id;
            setImage(images[id]);
        }
    
    
    public void act() 
    {
        
            GasPumpWorld obj = (GasPumpWorld)this.getWorld();
            String state = obj.getState().getMessage().toString();
            if (Greenfoot.mouseClicked(this)) {
                if(this.id == 15) {
                     obj.setState(new Cancel(obj));
                     
                }
                else if(this.id>9 && this.id<14){
                    Greenfoot.playSound("beep.wav");
                }
                else{
                switch(state){
                        
                        case "advt": obj.setState(new CardInserted(obj)); break;
                        case "cardInserted": obj.setState(new StateOne(obj)); break;
                        case "one":  obj.setState(new StateTwo(obj)); break;
                        case "two":  obj.setState(new StateThree(obj)); break;
                        case "three":obj.setState(new StateFour(obj)); break;
                        case "four": obj.setState(new StateActive(obj));break;
                        case "active" : Greenfoot.playSound("beep.wav");
                                        break;  
                               }
                               
                            }
                            }
            /*displaymessage d  = (displaymessage) getOneObjectAtOffset(350,100,null);
            state = obj.getState().getMessage().toString();
            switch(state){
            
            case "advt":  
                          obj.removeObject(d);
                          d = new displaymessage("Welcome Boss!!!");
                          getWorld().addObject(d,350,100);  
                          break;
            case "one":   d = (displaymessage) getOneObjectAtOffset(350,100,null);
                          obj.removeObject(d);
                          d = new displaymessage("Enter your Zip code\n\n * _ _ _ _");
                          getWorld().addObject(d,350,100);  
                          break;
                        
            case "two":   d = (displaymessage) getOneObjectAtOffset(350,100,null);
                          obj.removeObject(d);
                          d = new displaymessage("Enter your Zip code\n\n * * _ _ _");
                          getWorld().addObject(d,350,100);  
                          break;
           
            case "three": d = (displaymessage) getOneObjectAtOffset(350,100,null);
                          obj.removeObject(d);
                          d = new displaymessage("Enter your Zip code\n\n * * * _ _");
                          getWorld().addObject(d,350,100);  
                          break;
                        
            case "four":  d = (displaymessage) getOneObjectAtOffset(350,100,null);
                          obj.removeObject(d);
                          d = new displaymessage("Enter your Zip code\n\n * * * * _");
                          getWorld().addObject(d,350,100);  
                          break;
                        
            case "active": d = (displaymessage) getOneObjectAtOffset(350,100,null);
                           obj.removeObject(d);
                           d = new displaymessage("Please select Fuel type");
                           getWorld().addObject(d,350,100);  
                           break;
                            
            
        }
                            
            */
            
    }    
}
