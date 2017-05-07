/**
 * Write a description of class StateAdvt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StateAdvt implements IGasMachineState 
{
    GasPumpWorld world;
    
    public StateAdvt(GasPumpWorld obj){
        this.world = obj;
        
    }
    
    public void enter_pin(GasPumpWorld obj){
        this.world = obj;
    }
    
    public String getMessage(){
        return "advt";
    }
}
