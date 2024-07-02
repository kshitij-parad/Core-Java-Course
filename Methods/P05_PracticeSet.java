
public class P05_PracticeSet {

    //Que: 1
    // static void printStar(int n){
    //     for(int i = 0; i<n;i++){
    //         for(int j = 0; j < i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    //Que 2
    // static int nNatSum(int n) {
    //     if (n == 1) {
    //         return 1;
    //     }

    //     return n + nNatSum(n-1);
    // }


    //Que 3
        static  int fibonacci(int n ){
            if(n==1 || n==0){
                return  1;
            }
            else{
                return  fibonacci( n-2)+ fibonacci(n-1);
            }
        }


    public static void main(String[] args) {

        //Que 1
        // printStar(5);


        //Que 2
        // int ans = nNatSum(5);
        // System.out.println(ans);

        //Que 3
        System.out.println(fibonacci(3));

    }
}
