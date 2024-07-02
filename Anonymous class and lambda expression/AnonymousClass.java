interface DemoInt{
    void meth1();
    void meth2();
}

class AnonyDemo implements DemoInt{

    @Override
    public void meth1() {
        System.out.println("Meth1");
    }

    @Override
    public void meth2() {
        System.out.println("Meth2");
    }

    public void anony()
    {
        System.out.println("anony");
    }


}


public class AnonymousClass{
    public static void main(String[] args) {

        //IF we want to use onnly method of DemoINt interface meth1() and meth2()

        DemoInt obj1 = new AnonyDemo();
        obj1.meth1();
        obj1.meth2();
        // obj1.anony(); // Error--> The method anony() is undefined for the type DemoInt

        //Instead of these above lines, if we want to use methods only onece we can do the following:
        //creating anonymoys object

        DemoInt obj2  = new DemoInt(){
            @Override
            public void meth1() {
                System.out.println("Meth1 of anony");
            }
        
            @Override
            public void meth2() {
                System.out.println("Meth2 of anony");
            }
        };

        obj2.meth1();
        obj2.meth2();



        
    }
}