public class StateFour implements IGasMachineState 
{
    GasPumpWorld world;
    
    public StateFour(GasPumpWorld obj){
        this.world = obj;
    }
    
    public void enter_pin(GasPumpWorld obj){
        this.world = obj;
    }
    
    public String getMessage(){
        return "four";
    }
    
    
}
