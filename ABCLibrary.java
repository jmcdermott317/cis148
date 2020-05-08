/**
 * John McDermott
 *
 * Final Project
 */
import java.util.Scanner;

public class ABCLibrary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookCollection bookCollection = new BookCollection();

        while (true) {
            System.out.println("Enter '1' to add a new book to the collection");
            System.out.println("Enter '2' to output entire collection");
            System.out.println("Enter '3' to find a book in the collection");
            System.out.println("Enter '4' to remove a book from the collection");
            System.out.println("Enter '5' to output all books by an author with a particular last name initial");
            System.out.println("Enter '6' to output all books with a particular copyright year");
            System.out.println("Enter anything else to quit");

            String input = sc.nextLine();
            if (input.equals("1")) {
                System.out.println("Enter book title");
                String title = sc.nextLine();
                System.out.println("Enter ISBN");
                String isbn = sc.nextLine();
                System.out.println("Enter last name");
                String lname = sc.nextLine();
                System.out.println("Enter first name");
                String fname = sc.nextLine();
                System.out.println("Enter year");
                int year = sc.nextInt();
                sc.nextLine();
                bookCollection.addBookToCollection(isbn, title, lname, fname, year);
            } else if (input.equals("2")) {
                bookCollection.printCollection();
            } else if (input.equals("3")) {
                System.out.println("Enter ISBN");
                String isbn = sc.nextLine();
                LibraryBook book = bookCollection.findByISBN(isbn);

                if (book != null) {
                    System.out.println("after findByISBN: " + book.toString());
                }
            } else if (input.equals("4")) {
                System.out.println("Enter ISBN");
                String isbn = sc.nextLine();
                bookCollection.removeBookFromCollection(isbn);

            } else if (input.equals("5")) {
                System.out.println("Enter last name initial");
                String lastInitial = sc.nextLine();
                bookCollection.printAllByLastInitial('S');

            } else if (input.equals("6")) {
                System.out.println("Enter copyright year");
                int year = sc.nextInt();
                sc.nextLine();
                bookCollection.printAllByDate(year);
            } else {
                break;
            }

            System.out.println("");
        }
    }
}
