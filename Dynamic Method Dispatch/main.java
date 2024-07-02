
class Base{
    void Meth(){
        System.out.println("this is bases");
    }
}

class Derived extends  Base{
    void Meth(){
        System.out.println("this is derived");
    }
}


public class main{
    public static void main(String[] args) {
        
        // Base b1 = new Base(); //allowed
        // b1.Meth();

        // Derived d1 = new Derived(); //allowed
        // d1.Meth();



        // Derived db1 = new Base();  //not allowed
        // db1.Meth();


        //but, refrence to base class and object of derived class is allowed, when we run overriden method on derived class obj it will call the method of derived class.

        Base bd1 = new Derived();
        bd1.Meth(); 


        //this is runtime polymorphism, because object generation/ creation is done at runtime
    }
}