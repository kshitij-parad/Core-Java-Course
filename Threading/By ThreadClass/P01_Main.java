
class MyThread1 extends  Thread{
 
    
    @Override
    public  void  run(){
        int i=0;
        while(i<100){
        System.out.println("Thread 1");
        i++;
    }
    
   }
} 
class MyThread2 extends  Thread{
    @Override

    public  void  run(){
        int i =0;
        while(i<100){
            System.out.println("Thread 2");
            i++;
        }
    }
} 

public class P01_Main{
public static void main(String[] args) {
    
    MyThread1 m1 = new MyThread1();
    MyThread2 m2 = new MyThread2();

    m1.start();
    m2.start();
}
}