class myThreadcls extends  Thread{

    
    public myThreadcls(String name) {
        super(name);
    }


    @Override
    public  void run(){
       int i =0;
       while(i<100){
         
        System.out.println(this.getName());
       }
    }
} 

public class Main3 {
 public static void main(String[] args) {
    myThreadcls my = new myThreadcls("th1");
    myThreadcls my2 = new myThreadcls("th2");
    myThreadcls my3 = new myThreadcls("th3");
    myThreadcls my4 = new myThreadcls("th4");
    myThreadcls my5 = new myThreadcls("th5 MOst IMP");

    my5.setPriority(Thread.MAX_PRIORITY);
    my2.setPriority(Thread.MIN_PRIORITY);

    my.start();
    my2.start();
    my3.start();
    my4.start();
    my5.start();

 }   
}
