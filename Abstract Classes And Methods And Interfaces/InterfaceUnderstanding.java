
// now imagine, we have camera interface, we have 2 abstarct methods and now we have implemented these two methods in a smartPhone class,
//and now we want add new method in camera interface, but if add this method, then we will have to implement this method in all the classees
//implementing camera interface, suppose we have total 100 classes, now are we going to implement this method in those 100 classes?no, right?
//to solve this problem we have Defalt functions.

/*
Interfaces can have default methods with implementation in Java 8 on later.
Interfaces can have static methods as well, similar to static methods in classes.
Default methods were introduced to provide backward compatibility for old interfaces so that they can have new methods without affecting existing code.
 */

 /*
  Default Methods and Multiple Inheritance
  In case both the implemented interfaces contain default methods with same method signature,
 the implementing class should explicitly specify which default method is to be used or it should override the default method.
 */

/* 
  private methods in interfaces: 
  we all know that methods in interface are public, then whats the use of private methods?
   yes we can write private methods in java interface,
   
   suppose, there is lot of code in default method, but still we have wrote few more lines of code, then we can write these 
    few line in private method and call it in that defuault method.

 */

interface Camera {

    void clickPhoto();

    void ShootVideo();

    private  void  privateMeth(){
        System.out.println("this is priavte of camera intergface");
    }

    default void shoot4K(){
        privateMeth();
        System.out.println("Default shooting 4k");
    }
}

interface Wifi {
    String[] getNetworks();
}

interface Gps {

    void gettingGps();
}

class CellPhone {

    void callANumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

}

class SmartPhone extends CellPhone implements Wifi, Gps, Camera {

    @Override
    public void clickPhoto() {
        System.out.println("clicking photo...");
    }

    @Override
    public void ShootVideo() {
        System.out.println("Shooting Video");
    }


    //if we remove below implementation ,method in interface will be called.
    // @Override
    // public void shoot4K(){
    //     System.out.println("Shooting 4k video..");
    // }

    @Override
    public void gettingGps() {
        System.out.println("Getting Gps Service...");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of wifiNetworks...");
        String[] availableNetworks = {"kshitij", "Durvesh"};
        return availableNetworks;
    }

}

public class InterfaceUnderstanding {

    public static void main(String[] args) {
        SmartPhone sm1 = new SmartPhone();

        String[] wifiNetwors = sm1.getNetworks();
        for (String nw : wifiNetwors) {
            System.out.println(nw);
        }

        sm1.callANumber(87393);

        sm1.clickPhoto();
        sm1.ShootVideo();

        sm1.gettingGps();

        sm1.shoot4K();

        // sm1.privateMeth();  --> error - we cant do this as thisis private
        sm1.shoot4K();   //if we comment implementation of this in child,and run defualt, thhis will execute code present in priaveMeth()
                        //Becausewe called that priavate method in default method
        
    }
}
