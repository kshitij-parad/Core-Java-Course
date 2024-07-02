
import java.util.Scanner;

public class P03_PracticeSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Que 1:
        // int sub1, sub2, sub3, perc;

        // System.out.println("Enter the marks: ");
        // sub1 = sc.nextInt();
        // sub2 = sc.nextInt();
        // sub3 = sc.nextInt();

        // perc = (sub1 + sub2 + sub3) * 100 / 300;

        // if (perc > 40 && sub1 > 33 && sub2 > 33 && sub3 > 33) {
        //     System.out.println("You are pass.");
        // } else {
        //     System.out.println("YOu are fail.");
        // }


        //Que 2
        // System.out.println("\t 1].5L - 5L\n\t2]5L-10L\n\t3]Above 10L ");

        // System.out.print("Enter your income (in lacks): ");
        // float inc = sc.nextFloat();

        // if(inc < 2.5){6
        //     System.out.println("you are not eligible to pay taxes");
        // }
        // else if(inc >= 2.5 && inc < 5){
        //     float tax = inc * 5/100;
        //     System.out.println("You will have to pay "+tax);
        // }
        // else if(inc >= 5 && inc < 10){
        //     float tax = inc*20/100;
        //     System.out.println("You will have to pay "+tax);
        // }
        // else{
        //     float tax = inc*30/100;
        //     System.out.println("You will have to pay "+tax);
        // }
        

        //Que 3

        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if((year%4==0 && year%100!=0)|| year%400==0  ){
            System.out.println("yerar is leap year");
        }
        else{
            System.out.println("Enterd year is not leap year");
        }
       

    }
}

