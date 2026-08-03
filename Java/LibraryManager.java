import java.util.Scanner;


public class LibraryManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter the author's name: ");
        String author = scanner.nextLine();

        Book book = new Book(title, author);

        System.out.println();
        System.out.println("The book has beeen created successfully.");

        book.displayInfo();

        System.out.println(); 
        System.out.print("Would you like to borrow this book? (yes/no): ");

        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {

            // yes, YES, and Yes will all be accepted as valid input
            book.borrowBook();
        } else { 
            System.out.println("The book was not borrowed.");
        }

        System.out.println();
        book.displayInfo();

        scanner.close(); 
    }
} 
