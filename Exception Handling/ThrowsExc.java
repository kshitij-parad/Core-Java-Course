
class NegativeException extends Exception {

    @Override
    public String toString() {
        return "Number cant be negative";
    }

    @Override
    public String getMessage() {
        return "Number is negative this is no allowed";
    }
}

public class ThrowsExc {


    //we can also throw predefined exception like Arithematic exception..
    //Even we can also throw ArrayIndexOutofBound exception

    public static void getASum(int a) throws NegativeException {

        if (a < 0) {
            throw new NegativeException();
        }
        System.out.println(a+1);

    }

    public static void main(String[] args) {
        int a = 1;

        try {
            getASum(a);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }

    }
}
