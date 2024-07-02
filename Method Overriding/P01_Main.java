
//while overriding method: it is necessary to subClass to write its own implemenation in overriing method( method of parent class).
// 1] method name and signature should be same in parent class and subclass.
//2] access modifier should be same (public, defualt)
//3] final,static cant ne overriden
//adding @override noation is recommended not compulsary

class base {

    int x;

    int returnOne(int a) {
        System.out.println("Base");
        return a + 1;
    }

}

class derived extends base {

    int y;

    @Override
    int returnOne(int x) {

        System.out.println("derived");
        return x + 1;
    }
}

public class P01_Main {

    public static void main(String[] args) {

        base b = new base();
        System.out.println(b.returnOne(7));

        derived d = new derived();
        System.out.println(d.returnOne(8));

    }
}
