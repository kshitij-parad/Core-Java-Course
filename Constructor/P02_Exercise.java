
import java.util.Random;
import java.util.Scanner;

class GuessGame {

    private int generatedNO;
    private int noOfGuesses;
    private int userGuess;
    public boolean flag;

    public GuessGame() {
        Random rand = new Random();
        generatedNO = rand.nextInt(101);
    }

    int getNoOfGuesses() {
        return noOfGuesses;
    }

    void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    void takeUserInput() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your guess: ");
        this.userGuess = sc.nextInt();
    }

    void isCorrectNumber() {
        if (generatedNO == this.userGuess) {
            System.out.println("Yaayyy!!, You guessed correctly, it is " + this.userGuess);
            flag = true;
        } else if (generatedNO > this.userGuess + 20) {
            System.out.println("You are far away from the correct number, you are too low.");
        } else if (generatedNO < this.userGuess - 20) {
            System.out.println("You are far away from the correct number, you are too high.");
        } else if (generatedNO > this.userGuess) {
            System.out.println("You are very close to the correct number, you are low.");
        } else {
            System.out.println("You are very close to the correct number, you are high.");
        }

    }

}

public class P02_Exercise {

    public static void main(String[] args) {

        GuessGame g = new GuessGame();
        int count = 0;
        do {
            g.takeUserInput();  //5
            g.isCorrectNumber();

            count++;
            g.setNoOfGuesses(count);
        } while (g.flag == false);
        System.out.println("You guessed it in " + g.getNoOfGuesses());

    }
}
