public class StateActive implements IGasMachineState 
{
    GasPumpWorld world;
    
    public StateActive(GasPumpWorld obj){
        this.world = obj;
    }
    
    public void enter_pin(GasPumpWorld obj){
        this.world = obj;
    }
    
    public String getMessage(){
        return "active";
    }
    
    
}
