
class MyRunnable implements Runnable{

    @Override
    public void run(){
        for(int i= 0;i<20;i++){
            System.out.println("thread 1");
        }
    }
} 
class MyRunnable2 implements Runnable{

    @Override
    public void run(){
        for(int i= 0;i<20;i++){
            System.out.println("thread 2");
        }
    }
} 

public class Main{
    public static void main(String[] args) {

        MyRunnable r1= new MyRunnable();
        MyRunnable2 r2= new MyRunnable2();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        
    }
}