public class BookArrayExample {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new Book(
            "Harry Potter",
            "J. K. Rowling"
        );

        books[1] = new Book(
            "The Hobbit",
            "J. R. R. Tolkien"
        );

        books[2] = new Book(
            "The Little Prince",
            "Antoine de Saint-Exupery"
        );

        System.out.println("All books:");
        System.out.println();

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book number " + (i + 1));

            books[i].displayInfo();
            // books[0].displayInfo()
            // books[1].displayInfo()
            // books[2].displayInfo()

            System.out.println();
        }

        for (Book book : books) {
            book.displayInfo();

            System.out.println();
        }

        System.out.println("Borrowing the second book:");
        books[1].borrowBook();

        System.out.println();
        System.out.println("Updated book information:");
        System.out.println();

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book number " + (i + 1));
            books[i].displayInfo();
            System.out.println();
        }

        for (Book book : books) {
            book.displayInfo();

            System.out.println();
        }
    }
}