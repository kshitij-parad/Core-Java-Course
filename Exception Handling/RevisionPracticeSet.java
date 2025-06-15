
import java.util.Scanner;
import java.util.regex.Matcher;
// ✅ Practice Set – Q1 (Level: Easy)
// Write a Java program that:
// Takes two integers a and b.
// Divides a by b inside a try block.
// If b == 0, catch the exception and print "Cannot divide by zero".
// Always print "Program ended" using finally.

// ✅ Practice Set – Q2 (Level: Easy → Medium)
/* 📄 Task:
        Write a Java program that:
        Takes a string input from the user.
        Converts it to an integer using Integer.parseInt().
        Divides 100 by that number.
        Use multi-catch to handle:
        NumberFormatException → print "Invalid number entered"
        ArithmeticException → print "Cannot divide by zero"
        Always print "Operation complete" using finally.
 */
// ✅ Practice Set – Q3 (Level: Medium)
/*
        📄 Task:
        Write a Java program that:
            Asks the user to enter their age.
            Create a method validateAge(int age) that:
            If age is less than 18, uses throw to raise an IllegalArgumentException with the message "Not eligible to vote".
            Otherwise, prints "Eligible to vote".
            Use throws in the method signature.
            Call this method from main() and handle the exception using try-catch.
            Always print "Check complete" using finally.


 */
//✅ Practice Set – Q4 (Level: Medium+)
/*
    📄 Task: Create a custom exception and use it in a real scenario.
    🧠 Problem Statement:
        Write a Java program that:

        Defines a custom checked exception called InvalidPasswordException.
        In main(), ask the user to enter a password.
        Create a method validatePassword(String password) that:
        Throws InvalidPasswordException if:
        Password length is less than 8
        OR doesn't contain at least one digit
        If valid, print "Password accepted", else catch the exception and print its message.
        Always print "Validation complete" using finally.
 */
public class RevisionPracticeSet {

    /*Problem stare 03 */
    // static void  validateAge(int age) throws IllegalArgumentException{
    //     if(age < 18){
    //         throw  new IllegalArgumentException("Not Eligible to Vote.");
    //     }
    //     else{
    //         System.out.println("Eligible to Vote");
    //     }
    // }


    // Problem Statment 04
     static  public class InvalidPasswordException extends Exception {

        InvalidPasswordException(String msg) {
            super(msg);
        }
    }

    //Problem Statement 04
    static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8 || !password.matches(".*\\d.*")) {
            throw new InvalidPasswordException("Invalid Password.");
        } else {
            System.out.println("Password accepted");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*  Problem Statment 01
        
        int a;
        int b;
        
       
        System.out.println("Enter the number 1");
        a = sc.nextInt();

        System.out.println("Enter the number 2");
        b = sc.nextInt();

        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("Program ended");
        }

         */
        //Problem Statement 02
        /*
            try {
                System.out.println("Enter the String");
                String num = sc.next();

                int number = Integer.parseInt(num);
                System.out.println(number / 100);
            } 
            
            catch (NumberFormatException | ArithmeticException e) {

                if(e instanceof NumberFormatException){
                                System.out.println("Invalid number entered");
                }
                else{
                    System.out.println("Cannot divide by Zero");
                }
            } 
            
            finally {
                System.out.println("Operation complete");
            }
         */
        //Problem Statement 03
        /*
        try {
            int age = 17;
            validateAge(age);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Not eligible to vote");
        }
        finally{
            System.out.println("Check complete.");
        }
         */
        //Problem Statement 04
        try {
            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            validatePassword(pass);
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation complete.");
        }

    }
}
