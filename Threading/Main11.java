

class myClassThread extends  Thread {

    myClassThread(String name){
        super(name);
    }

    @Override
    public void run(){
        int i =0;
        while(i <18){
            System.out.println("thread");
            i++;
        }
    }
} 



public class Main11{
    public static void main(String[] args) {

        myClassThread mct = new myClassThread("kp");
        mct.start();

        System.out.println("Name: "+mct.getName());
        System.out.println("id: "+mct.getId());
        
    }
}
