class MyException extends Exception{
    public String toString(){
       return "toString() ";
    }

    public  String getMessage(){
        return "getMessage()";
    }
}

public class Main {

    public static void main(String[] args) {
        
        int a =8;
        if(a<9){
            try {
            // throw new MyException();

            //we can also throw:
            throw  new ArithmeticException("thi si arthemetic exception");


            } catch (Exception e) {

                // System.out.println(e);
                // System.out.println(e.getMessage());
                // System.out.println(e.toString());

                e.printStackTrace();

                System.out.println("Finished");
            }
    
        }
    }
}
