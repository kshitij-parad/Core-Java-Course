//FunctionalInterface is interface where interface has only 1 method

@FunctionalInterface
interface demoLamda {

    void meth1(int a);

}

class demoLamdaClass implements demoLamda {

    public void meth1(int a) {
        System.out.println("meth 1 " + a);
    }
}

public class LambdaExp {

    public static void main(String[] args) {

        //tradiona way :

        demoLamdaClass d = new demoLamdaClass();
        d.meth1(4);


        //lamda expression: 
        //we dont need above class to implent and run the methods of interface

        demoLamda obj = (a)->{System.out.println("this is method 1 of lambad"+a);};

        obj.meth1(8);

    }
}
