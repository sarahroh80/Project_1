public class LibraryApp {
    public static void main(String[] args) {
        Book book = new Book("The Little Prince", "Antoine de Saint-Exupery");

        System.out.println("Initial book information:");
        book.displayInfo();

        System.out.println();

        book.borrowBook();
        book.displayInfo();

        System.out.println();

        book.borrowBook();

        System.out.println();

        book.returnBook();
        book.displayInfo();
    }
}