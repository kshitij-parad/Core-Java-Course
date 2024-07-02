class myclsTh1 extends Thread{

    @Override
    public  void run(){
        for(int i = 0;i<49;i++){
            System.out.println("Thread 1");

        }
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class myclsTh2 extends Thread{

    @Override
    public  void run(){
        for(int i = 0;i<49;i++){
            System.out.println("Thread 2");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        myclsTh1 m1 = new myclsTh1();
        myclsTh2 m2 = new myclsTh2();

        //meth 1 .join()
        // m1.start();
        // try{
        //     m2.join();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // m2.start();


        //Meth 2: sleep

        m1.start();

        m2.start();

    }
}