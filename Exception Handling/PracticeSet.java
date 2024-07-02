
import java.util.Scanner;

public class PracticeSet {

    public static void main(String[] args) {
        //QUE: 1

        // System.out.println(5/0);    //Arithematic
        // System.out.println(2000 - 78 );   // if 78 is age --> logial
        // System.out.println(5x8); //syntax
        //Que 2:
        // try {
        //     int x = 8;
        //     int y = 0;
        //     System.out.println(x / y);
        // } catch (IllegalArgumentException il) {
        //     System.out.println("hihi");
        // } catch (ArithmeticException ae) {
        //     System.out.println("haha");
        // }


        //Que 3:
        // Scanner sc = new Scanner(System.in);

        // int[] a = {10, 51, 56, 7, 8};
        // boolean flag = true;

        // while (flag == true) {
        //     int ind = sc.nextInt();

        //     try {

        //         System.out.println(a[ind]);
        //         flag = false;

        //     } catch (Exception e) {
        //         System.out.println(e);
        //     }
        // }


        //Que 4:
        Scanner sc = new Scanner(System.in);

        int[] a = {10, 51, 56, 7, 8};
        boolean flag = true;
        int count=0;

        while (flag && count<6) {
           
            int ind = sc.nextInt();

            try {

                System.out.println(a[ind]);
                flag = false;
                break;

            } catch (Exception e) {
                System.out.println(e);
                count++;
            }
            
   
       }
    }
}
