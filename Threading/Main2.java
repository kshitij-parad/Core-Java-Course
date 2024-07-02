

class myClassThread1 implements  Runnable{
    
    public void run(){
        int i =0;
        while(i <18){
            System.out.println("thread");
            i++;
        }
    }
} 
public class Main2{
    public static void main(String[] args) {

        myClassThread1 mct = new myClassThread1();
        Thread th =new Thread(mct,"kp" );
        th.start();

        System.out.println("Name: "+th.getName());
        System.out.println("id: "+th.getId());
        
    }
}
