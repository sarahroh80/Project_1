

public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book (
            "Harry Potter",
            "J. K. Rowling"
        );

        Book book2 = new Book (
            "The Hobbit",
            "J. R. R. Tolkien"
        );

        Book book3 = new Book (
            "The Little Prince",
            "Antoine de Saint-Exupery"
        );

        System.out.println("Intiial book information:");
        System.out.println();

        book1.displayInfo();
        System.out.println();

        book2.displayInfo();
        System.out.println();

        book3.displayInfo();

        System.out.println();
        System.out.println("Borrowing the second book;");
        book2.borrowBook();

        System.out.println();
        System.out.println("Updated book information:");
        System.out.println();

        book1.displayInfo();
        System.out.println();

        book2.displayInfo();
        System.out.println();

        book3.displayInfo();
    }
}