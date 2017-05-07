public class StateThree implements IGasMachineState 
{
    GasPumpWorld world;
    
    public StateThree(GasPumpWorld obj){
        this.world = obj;
    }
    
    public void enter_pin(GasPumpWorld obj){
        this.world = obj;
    }
    
    
    public String getMessage(){
        return "three";
    }
    
    
}
