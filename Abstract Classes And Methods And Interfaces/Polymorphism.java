
interface Camera {

    void clickPhoto();

    void ShootVideo();

    private void privateMeth() {
        System.out.println("this is priavte of camera intergface");
    }

    default void shoot4K() {
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

public class Polymorphism {

    public static void main(String[] args) {

        // we have reated obj of smarpone with reference of Camera,so can only run methods of Camera interface
        Camera cam1 = new SmartPhone();
        cam1.ShootVideo();

        // cam1.gettingGps(); //Erro->The method gettingGps() is undefined for the type Camera


        //  we have reated obj of smarpone with reference of GPS ,so can only run methods of GPS interface
        Gps gps1 = new SmartPhone();
        gps1.gettingGps();

        // gps1.ShootVideo(); //Error -> The method ShootVideo() is undefined for the type Gp
    }
}
