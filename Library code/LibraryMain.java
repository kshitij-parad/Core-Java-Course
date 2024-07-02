
import java.util.Scanner;

class Library {

    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added.");
    }

    void issueBook(String book) {
        int i = 0;
        for (String bookInLib : books) {
            if (books[i] != null) {
                if (bookInLib.toLowerCase().equals(book.toLowerCase())) {
                    System.out.println(bookInLib + " is issued.");
                    bookInLib = null;

                    // books[i] = "Book currently not availble";
                    i++;
                    no_of_books--;
                    break;
                }
            }
            else{
                System.out.println("Lib is emptyyy");
                break;
            }
        }


    }

    void returnBook(String bookToRet) {
        int i = 0;
        for (String book : books) {
            if (books[i] == null) {
                books[i] = bookToRet;
                i++;
                break;
            }
        
        }

        System.out.println(bookToRet + " has been returned..");
    }

    void showAvailableBooks() {
        int i = 0;
        if(no_of_books !=0){
            System.out.println("Available Books are: ");
            for (String book : books) {
    
                if (book != null) {
    
                    System.out.println((i + 1) + " " + book);
                    i++;
                }
            }
        }
        else{
            System.out.println("No books are available.");
        }
       
    }
}

public class LibraryMain {

    public static void main(String[] args) {
        Library l = new Library();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("\n\t\t\t1]Add Book\n\t\t\t2]Issue Book\n\t\t\t3]Show Available Books\n\t\t\t4]Retrun Book\n\t\t\t5]Exit");
            System.out.println("------------------------------------------------------------------------------------------");

            System.out.print("Enter your Choice: ");
            int ch = sc.nextInt();

            sc.nextLine();    //improvement by Chatgpt: issue was i was not able to take book name as input in add book.
 

            switch (ch) {
                case 1 -> {
                    System.out.print("Enter book name: ");
                    String bookNameRaw = sc.nextLine();
                    String bookName = bookNameRaw.trim();
                    l.addBook(bookName);
                }
                case 2 -> {
                    System.out.print("Enter book name: ");
                    String bookNameRaw = sc.nextLine();
                    String bookName = bookNameRaw.trim();
                    l.issueBook(bookName);
                }
                case 3 -> {
                    l.showAvailableBooks();
                }
                case 4 -> {
                    System.out.print("Enter book name: ");
                    String bookNameRaw = sc.nextLine();
                    String bookName = bookNameRaw.trim();
                    l.returnBook(bookName);
                }
                case 5 -> {
                   System.out.println("\t\t\tThank youu!!!!");
                   System.exit(0);
                }

            }

        }while(true);

    }
}
