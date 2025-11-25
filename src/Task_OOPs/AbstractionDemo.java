package Task_OOPs;
interface Printable {
    // Abstract method (no body)
    void printDetails();
}

// Class implementing Printable
class Book implements Printable {
    String title = "Java Programming";

    @Override
    public void printDetails() {
        System.out.println("Book Title: " + title);
    }
}

// Main Class
public class AbstractionDemo {
    public static void main(String[] args) {

        // Creating object of Book
        Book b = new Book();

        // Calling interface method
        b.printDetails();
    }
}