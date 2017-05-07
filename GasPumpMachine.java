import greenfoot.*;
import java.util.*; 

public class GasPumpMachine  extends Actor //implements IComponent
{
   public Screen screen;
   public Button [] buttons;
   public MenuButton [] menuButtons;
   public CardSlot cardSlot;
   public OriginalCard originalCard;
   public DuplicateCard duplicateCard;  
   public ReceiptPrinter receiptPrinter;
   public Nozzle nozzle0;
   public Nozzle nozzle1;
   
   
   public GasPumpMachine(Screen s, Button [] b, MenuButton [] m, CardSlot cs, OriginalCard o, DuplicateCard d, ReceiptPrinter rp, Nozzle n0, Nozzle n1){
       this.screen=s;
       this.buttons=b;
       this.menuButtons=m;
       this.cardSlot=cs;
       this.originalCard=o;
       this.duplicateCard=d;
       this.receiptPrinter=rp;
       this.nozzle0=n0;
       this.nozzle1=n1;           
   }
   
   public OriginalCard getOriginalCard(){
       return originalCard;
   }
   
   public DuplicateCard getDuplicateCard(){
       return duplicateCard;
   }
   
   
   public void act(){

         
    
    
   }
    
}
