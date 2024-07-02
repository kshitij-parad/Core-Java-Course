
class Base {

    int x;

    int getX() {
        return this.x;
    }

    void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base {

    int y;

    int getY() {
        return this.y;
    }

    void setY(int y) {
        this.y = y;
    }
}

public class Learn {

    public static void main(String[] args) {

        Base b = new Base();
        b.setX(6);
        System.out.println(b.getX());

        // base class cant access the properties and methods of derived class 

        Derived d = new Derived();
        d.setX(7);
        System.out.println(d.getX());

        d.setY(8);
        System.out.println(d.getY());

    }
}
