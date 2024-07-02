//Object of abstract method cannot be created.
//if we create an abstract method in any class, then we have to make that class abstrct class.
//normal class can extend the abstract class but derived class has to implement abstract method of parent class(abstract class)
//if we dont implement abstarct method of parent class in child class then we have make a child card abstract
//Abstract class can contain non-abstract methods also.

abstract class Base {

    void Hii() {
        System.out.println("this is parent Hii");
    }

    abstract void greet();
}

class derived extends Base {

    void greet() {
        System.out.println("this is Derived abstarct method in derived class");
    }
}

//if we dont make below class abstract then we will need to implement abstarct method of base class.
//The type derived1 must implement the inherited abstract method Base.greet()Java(67109264)
// derived1 is not abstract and does not override abstract method greet() in Base.

abstract class derived1 extends Base {

    void methOfDerived1() {
        System.out.println("method of derived1");
    }

}

public class AbtractClass{

    public static void main(String[] args) {

        // Base b = new Base();   //Error- Base is abstract; cannot be instantiated

        derived d = new derived();   //Allowed
        d.Hii();
        d.greet();

        // derived1 d1 = new derived1();   //Error - derived1 is abstract; cannot be instantiated
    }
}
