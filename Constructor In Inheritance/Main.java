
class Base1 {

    int x;

    Base1() {
        System.out.println("Base1 Constructor with no parameter");
    }

    Base1(int x) {
        this.x = x;
        System.out.println("Base1 Constructor with x: " + x);
    }
}

class Derived1 extends Base1 {

    int y;

    Derived1() {
        super(1);  //because of this we can revoke base1 with param

        System.out.println("Derived 1 constuctor with no paramert");
    }
}

public class Main {

    public static void main(String[] args) {

        // Base1 b1 = new Base1(); // thiss will call Base1 with no parameter constructor
        // Derived1 d1 = new Derived1();  //thiss will call BAse1 constructor first then derived constuctor both with no parameter

        // As we saw above, it is by default revoking the constuctor of base1 when we create obj of derived1, now we have 2 constructorin base1 
        // now if we create obj of derived1 without parametr, this'll revoke base1 with no param,

        Derived1 d2 =  new Derived1(); //this will revoke deroved iwth no param, but base1 with param, because of super();
    }
}
