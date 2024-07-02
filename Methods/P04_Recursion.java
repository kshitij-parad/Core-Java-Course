public class P04_Recursion {

    // static  int factorial(int n){
    //     if(n==1 || n==0){
    //         return 1;
    //     }
    //     else{
    //         return  n* factorial(n-1);
    //     }
    // }


    //fibonacci 
    static int fibonacci(int n){
        if(n<=1){
            return 1;
        }
        else{
           return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        //Que 1:
        // int n = 5;
        // System.out.println(factorial(n));

        //Que: 2 fibonacci series

        int n = 12; //first 10 number offibonacci series

        for(int i =0;i<n;i++){
            System.out.println(fibonacci(i) + " ");
        }

    }
}
