//All the methd in interface are abstract;
//we can create properties(variables), but we cant chnage or modify them, as they are final
//A single class can implement multiple interfaces

interface Bicycle{
 int WHEEL =9;   //this is constant, final can not be changed

    void speedUp(int x);
    void brake();
}

class ModernBicycle implements  Bicycle{

    @Override
   public void speedUp(int x){
        System.out.println(x);
    }

    @Override
    public void brake() {
        System.out.println("braking");
    }

    
}

class  DigitalBicycle implements  Bicycle{
    @Override
    public void speedUp(int x){
         System.out.println(x+1);
     }
 
     @Override
     public void brake() {
         System.out.println("braking digital bicycle");
     }
}

public class InterfacesEx {
    public static void main(String[] args) {
        
        ModernBicycle mb = new ModernBicycle();
        mb.speedUp(5);
        mb.brake();


        DigitalBicycle dc = new DigitalBicycle();
        dc.speedUp(5);
        dc.brake();

        System.out.println(dc.WHEEL);
        // Bicycle.WHEEL = 18;  //cannot assign a value to static final variable WHEEL The final field Bicycle.WHEEL cannot be assigned
                               
    }
}
