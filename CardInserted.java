/**
 * Write a description of class CardInserted here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardInserted  implements IGasMachineState
{
    GasPumpWorld world;

    /**
     * Constructor for objects of class CardInserted
     */
    public CardInserted(GasPumpWorld obj)
    {
    }

   public void enter_pin(GasPumpWorld obj){
        this.world = obj;
    }
    
    public String getMessage(){
        return "cardInserted";
    }
}
