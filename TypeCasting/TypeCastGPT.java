import  java.util.Scanner;
public class TypeCastGPT {
    public static void main(String args[]){

        //Que: 1
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the number: ");
        // int numInt = sc.nextInt();

        // System.out.println("int :" + numInt);
        // System.out.println("byte :" + (byte) numInt);
        
        // System.out.println((numInt < -128 || numInt > 127)?"Yes":"no");


        //Que ;2

        System.out.print("How many Numbers? ");
        int n = sc.nextInt();

        int count = 0;
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter the number: ");
            int numInt = sc.nextInt();

            boolean isOverflow = numInt < -128 || numInt > 127;
            System.out.println("int :" + numInt);
            System.out.println("byte :" + (byte) numInt + ", " + (isOverflow ? "Overflow: Yes":"Overflow: no"));

            if(isOverflow){
                count++;
            }
    
        }

        System.err.println("OverflowCount: "+count + " and valid Bytes: "+ (n - count));

    }   
}
