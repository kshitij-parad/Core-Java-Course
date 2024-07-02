
import java.util.Random;
import java.util.Scanner;

public class P04_Exercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        do {
            System.out.println("\n\t1]Enter  0 for Rock\n\t2]Enter  1 for paper\n\t3]Enter  2 for Scissor");

            System.out.println("\nEnter you choice: ");
            int choice = sc.nextInt();

            if (choice <= 2 && choice >= 0) {
                int compChoice = rand.nextInt(3);

                if ((choice == 1 && compChoice == 0) || (choice == 2 && compChoice == 1) || (choice == 0 && compChoice == 2)) {
                    System.out.println("\n\t\t\tYou won");
                } else if (choice == compChoice) {
                    System.out.println("\n\t\t\tits a tie");
                } else {
                    System.out.println("\n\t\t\tComputer won");
                }
            } else if (choice == 9) {
                System.out.println("Come again....");
                System.exit(0);
            } else {
                System.out.println("\n\t\t\tEnter valid choice.");
            }

        } while (true);

    }
}
