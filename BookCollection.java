/**
 * John McDermott
 *
 * Final Project
 */
import java.util.ArrayList;

public class BookCollection {
    private ArrayList<LibraryBook> booklist;

    public BookCollection() {
        booklist = new ArrayList<>();
    }

    public void addBookToCollection(String isbn, String thetitle, String lname, String fname, int year) {
        LibraryBook libraryBook = new LibraryBook(thetitle, isbn, lname, fname, year);
        booklist.add(libraryBook);
    }

    public void removeBookFromCollection(String theISBN) {
        boolean bookFound = false;

        for (int i = 0; i < booklist.size(); i++) {
            LibraryBook book = booklist.get(i);

            if (theISBN.equals(book.getIsbnNum())) {
                booklist.remove(book);
                bookFound = true;
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Book was not found in the collection");
        }
    }
    public LibraryBook findByISBN(String theISBN) {
        LibraryBook book = null;
        boolean bookFound = false;

        for (int i = 0; i < booklist.size(); i++) {
            book = booklist.get(i);

            if (theISBN.equals(book.getIsbnNum())) {
                bookFound = true;
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Book was not found in the collection");
            book = null;
        }
        return book;
    }
    public void printAllByDate(int year) {

        for (int i = 0; i < booklist.size(); i++) {
            LibraryBook book = booklist.get(i);

            if (year == book.getCopyrightYear()) {
                System.out.println(book.toString());
            }
        }

    }
    public void printAllByLastInitial(char initial) {
        // make sure the character is uppercass
        initial = Character.toUpperCase(initial);
        for (int i = 0; i < booklist.size(); i++) {
            LibraryBook book = booklist.get(i);

            if (initial == book.authorLastInitial()) {
                System.out.println(book.toString());
            }
        }
    }
    public void printCollection() {

        for (int i = 0; i < booklist.size(); i++) {
            LibraryBook book = booklist.get(i);
                System.out.println(book.toString());
            }
        }


    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        System.out.println("bookCollection size before add: " + bookCollection.booklist.size());

        bookCollection.addBookToCollection("56062323455", "How to make a shed", "Smith", "Jonny", 2010);
        bookCollection.addBookToCollection( "56062323456", "How to make a garage","Smith", "Jonny", 2010);
        bookCollection.addBookToCollection("56062323798", "How to make a house", "Smith", "Jonny", 2011);
        bookCollection.addBookToCollection("56062323024", "How to make a deck", "Williams", "Cam", 2012);
        bookCollection.addBookToCollection("36062323001", "How to make a shed", "McDermott", "John", 2012);
        System.out.println("bookCollection size after add: " + bookCollection.booklist.size());

        bookCollection.removeBookFromCollection("56062323455");
        System.out.println("bookCollection size after remove: " + bookCollection.booklist.size());

        bookCollection.removeBookFromCollection("560623200000");
        System.out.println("bookCollection size after remove: " + bookCollection.booklist.size());

        LibraryBook libraryBook = bookCollection.findByISBN("56062323456");
        if (libraryBook != null) {
            System.out.println("after findByISBN: " + libraryBook.toString());
        }

        LibraryBook libraryBook2 = bookCollection.findByISBN("5606232000");
        if (libraryBook2 != null) {
            System.out.println("after findByISBN: " + libraryBook2.toString());
        }

        System.out.println("\nprintAllByDate by 2010 " );
        bookCollection.printAllByDate(2010);

        System.out.println("\nprintAllByDate by 2011 " );
        bookCollection.printAllByDate(2011);

        System.out.println("\nprintAllByDate by 2012 " );
        bookCollection.printAllByDate(2012);

        System.out.println("\nprintAllByLastInitial S" );
        bookCollection.printAllByLastInitial('S');

        System.out.println("\nprintAllByLastInitial M" );
        bookCollection.printAllByLastInitial('M');

        System.out.println("\nprintAllByLastInitial W" );
        bookCollection.printAllByLastInitial('W');

        System.out.println("\nprintCollection" );
        bookCollection.printCollection();

    }
}
