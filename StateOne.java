/**
 * Write a description of class StateOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StateOne implements IGasMachineState 
{
    GasPumpWorld world;
    
    public StateOne(GasPumpWorld obj){
        this.world = obj;
    }
    
    public void enter_pin(GasPumpWorld obj){
        this.world = obj;
    }
    
    public String getMessage(){
        return "one";
    }
    
    
}
