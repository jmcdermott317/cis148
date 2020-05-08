/**
 * John McDermott
 *
 * Final Project
 */


public class LibraryBook {


    private String title;
    private int copyrightYear;
    private String isbnNum;
    private String authorLastName;
    private String authorFirstName;

    //Constructors
    //FINISH CODING THIS CONSTRUCTOR TO INITIALIZE ALL instance variables
    public LibraryBook(String newtitle, String newisbn, String lname, String fname, int copyYear) {
        this.title = newtitle;
        this.isbnNum = newisbn;
        this.authorLastName = lname;
        this.authorFirstName = fname;
        this.copyrightYear = copyYear;
    }


    //provide set methods for all instance variable EXCEPT title and isbnNum HERE
    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public void setCopyrightYear(int copyrightYear) {
        this.copyrightYear = copyrightYear;
    }


    //provide get methods for all instance variables HERE
    public String getTitle() {
        return title;
    }

    public String getIsbnNum() {
        return isbnNum;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public int getCopyrightYear() {
        return copyrightYear;
    }


    //complete these three methods

    public char authorLastInitial() {
        return this.getAuthorLastName().charAt(0);
    }

    // this method prints out the authors name in form   LASTNAME, FIRSTNAME
    public void authorName() {
        System.out.print(this.getAuthorLastName() + ", " + this.getAuthorFirstName());
    }

    // this method prints out all info stored about this library book
    public void displayAll() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("isbn: " + this.getIsbnNum());
        System.out.println("author last name: " + this.getAuthorLastName());
        System.out.println("author first name: " + this.getAuthorFirstName());
        System.out.println("copyrightYear: " + this.getCopyrightYear());
    }


    // toString method for the LibraryBook class.
    @Override
    public String toString() {
        return "LibraryBook{" +
                "title='" + title + '\'' +
                ", copyrightYear=" + copyrightYear +
                ", isbnNum='" + isbnNum + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", authorFirstName='" + authorFirstName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        LibraryBook libraryBook = new LibraryBook("How to make a shed", "56062323455", "Smith", "Jonny", 2010);

        libraryBook.setAuthorLastName("Jones");
        libraryBook.setAuthorFirstName("John");
        libraryBook.setCopyrightYear(2008);

        System.out.println("Title: " + libraryBook.getTitle());
        System.out.println("isbn: " + libraryBook.getIsbnNum());
        System.out.println("author last name: " + libraryBook.getAuthorLastName());
        System.out.println("author first name: " + libraryBook.getAuthorFirstName());
        System.out.println("copyrightYear: " + libraryBook.getCopyrightYear());
        System.out.println("\n");

        System.out.println("author last initial: " + libraryBook.authorLastInitial());

        System.out.println("\n");

        libraryBook.authorName();

        System.out.println("\n");

        libraryBook.displayAll();

        System.out.println("\ntoString() - " + libraryBook.toString());

    }

}

