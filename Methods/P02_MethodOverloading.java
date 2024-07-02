
public class P02_MethodOverloading {

    static void foo() {
        System.out.println("this is foo");
    }

    static void foo(int x) {
        System.out.println("this is foo " + x);
    }

    static void foo(int x, int y) {
        System.out.println("this is foo " + (x + y));
    }

    public static void main(String[] args) {

        //Method overloading can not be perfomed by changing the return type of method

        //this is compile time polymorphism

        foo();
        foo(4);
        foo(4, 5);

    }
}
