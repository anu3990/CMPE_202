/**
 * Write a description of class YellowFuel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YellowFuel  implements IGasMachineState
{
    // instance variables - replace the example below with your own
     GasPumpWorld world;

    /**
     * Constructor for objects of class YellowFuel
     */
    public YellowFuel(GasPumpWorld obj)
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void enter_pin(GasPumpWorld obj){
        this.world = obj;
    }
    
    public String getMessage(){
        return "yellowFuel";
    }
}
