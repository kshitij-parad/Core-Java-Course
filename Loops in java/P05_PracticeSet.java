
public class P05_PracticeSet {

    public static void main(String[] args) {

        //Que: 1
        // for (int i = 4; i > 0; i--) {
        //     for (int j = i; j > 0; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //Que: 2
        // int n = 10;
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println(i);
        //         sum += i;
        //     }
        // }
        // System.out.println(sum);


        // //Que: 3
        // int num = 5;
        // for(int i=1;i<=10;i++){
        //     System.out.printf("%d x %d = %d",num, i ,num*i);
        //     System.out.println();
        // }

        //Que: 4
        // int num = 10;
        // for(int i=10;i>0;i--){
        //     System.out.printf("%d x %d = %d",num, i ,num*i);
        //     System.out.println();
        // }


        //Que: 5

        // int fact =1;
        // int n = 10;
        // for(int i = n; i > 0 ; i--){
        //     fact = fact * i;
        // }
        // System.out.println(fact);


        //Que 6:
        int fact = 1;
        int n = 5;
        int i = n;
        while (i > 0) {
            fact *= i;
            i--;
        }
        System.out.println(fact);
        System.out.println("hh");

    }
}
