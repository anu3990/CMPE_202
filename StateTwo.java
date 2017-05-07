public class StateTwo implements IGasMachineState 
{
    GasPumpWorld world;
    
    public StateTwo(GasPumpWorld obj){
        this.world = obj;
    }
    
    public void enter_pin(GasPumpWorld obj){
        this.world = obj;
    }
    
    public String getMessage(){
        return "two";
    }
    
}
