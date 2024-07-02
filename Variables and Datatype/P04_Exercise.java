
import java.util.Scanner;

public class P04_Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of subjects (Note: hit enter after entering marks of one subject): ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        int percentage = 100 * (m1+m2+m3+m4+m5)/500;

        System.out.println("Percentage is  "+ percentage);
        
    }
}
