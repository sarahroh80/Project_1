public class Book {
    private String title;
    private String author;
    private boolean borrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author; 
        this.borrowed = false;
    }

    public void borrowBook() {
        if (borrowed) {
            System.out.println(title + " is already borrowed. ");
        } else {
            borrowed = true;
            System.out.println("You borrowed " + title + ".");
        }
    }

    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println("You returned " + title + ".");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    public void displayInfo() {
        System.out.println("Title" + title);
        System.out.println("Author" + author);
        System.out.println("Avaliable: " + !borrowed);
    } 
}



