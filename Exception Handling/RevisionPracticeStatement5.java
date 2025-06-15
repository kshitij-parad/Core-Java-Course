/*
    ✅ Practice Set – Q5 (Level: Above Intermediate)
        📄 Problem Statement:
            You’re building a banking system. Create a Java program that:

            🔹 Requirements:
            Defines two custom exceptions:
            InsufficientFundsException (unchecked)
            TransactionFailedException (checked)
            Create a method withdraw(double balance, double amount) that:
                Throws InsufficientFundsException if amount > balance
               
                In main():
                    Call withdraw() and catch InsufficientFundsException
                    Then throw a TransactionFailedException, chaining the original cause (InsufficientFundsException)
                    Catch the TransactionFailedException and print:
                    The main message
                    The original cause using getCause()
                    Always print "Transaction complete" using finally.
 */
public class RevisionPracticeStatement5 {

   static class InsufficientFundsException extends RuntimeException{
        InsufficientFundsException(String msg){
            super(msg);
        }
    }

   static class TransactionFailedException extends Exception{
        TransactionFailedException(String msg, Throwable e){
            super(msg,e);
        }
    }

    static void withdraw(double balance, double amount) throws InsufficientFundsException{
        if(balance < amount){
            throw new InsufficientFundsException("You less money to withdraw.");
        }
        else{
            System.out.println("withdrawn");
        }

    }

    public static void main(String[] args) {
        try {
            withdraw(50, 10);
        } catch (InsufficientFundsException insufficientFundsException) {
            try{
                throw new TransactionFailedException("Low balance", insufficientFundsException);
            }
            catch(TransactionFailedException te){
                System.out.println(te.getMessage());
                System.out.println(te.getCause());
            }
        }
        finally{
            System.out.println("Transaction complete");
        }
    }
}
