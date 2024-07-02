/*
 we can extend a interface by creating another interface
 basically, interface extends interface and class implements interface
 */

 interface  interfaceSample{
    void meth1();
 }
 interface interfaceSample1 extends interfaceSample{
    void meth2();
 }

 class demo implements  interfaceSample1{

    @Override
    public void meth1(){
        System.out.println("meth1");
    }

    @Override
    public void meth2(){
        System.out.println("meth2");
    }
 }

public class InheritanceInInterface {
    public static void main(String[] args) {
        demo d = new demo();
        d.meth1();
        d.meth2();
    }
}
