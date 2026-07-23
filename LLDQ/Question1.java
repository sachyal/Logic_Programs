package LLDQ;

class BookNotFoundException extends RuntimeException {
    public BookNotFoundException() {
        super("BookNotFoundException: Book not Available");
    }

    public BookNotFoundException(String Message) {
        super(Message);
    }
}

class AlreadyIssuedException extends RuntimeException {
    public AlreadyIssuedException() {
        super("AlreadyIssuedException: Book already issued.");
    }

    public AlreadyIssuedException(String Message) {
        super(Message);
    }
}

class IssueLimitException extends Exception {
    public IssueLimitException() {
        super("IssueLimitException: Max 3 books can be issued");
    }

    public IssueLimitException(String Message) {
        super(Message);
    }
}

class Book {
    protected int id;
    protected String name;
    protected String author;
    protected String status;

    public Book(int id, String name, String author, String status) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.status = status;
    }

    public void issueBook() {
        if (this.status.equalsIgnoreCase("issued")) {
            throw new AlreadyIssuedException("this book is already issued");
        }
        this.status = "issued";
        System.out.println(this.name + "Book is issued");
    }

    public void returnBook() {
        this.status = "returned";
        System.out.println(this.name + "Book is returned");

    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getStatus() {
        return this.status;
    }

    public void displayinfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | author: " + author + "| status: " + status);
    }
}

class NormalBook extends Book {

    public NormalBook(int id, String name, String author, String status) {
        super(id, name, author, status);
    }
}

class ReferenceBook extends Book {
    public ReferenceBook(int id, String name, String author, String status) {
        super(id, name, author, status);
    }

    public void issueBook() {
        throw new AlreadyIssuedException("AlreadyIssuedException: Reference books cannot be issued");
    }
}

class Library {
    private Book books[] = new Book[50];
    private int bookCount = 0;
    private int issuedCount = 0;

    public void addBook(Book b) {
        if (bookCount < 50) {
            books[bookCount++] = b;
        }
    }

    public Book getBookById(int id) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId() == id) {
                return books[i];
            }
        }
        throw new BookNotFoundException("BookNotFoundException: Book not Found");

    }

    public void issueBookToStudent(int id) throws IssueLimitException {
        if (issuedCount >= 3) {
            throw new IssueLimitException("IssueLimitException: only 3 per student allowed");
        }
        try {
            Book b = getBookById(id);
            b.issueBook();
            issuedCount++;
        } catch (AlreadyIssuedException e) {
            System.out.println(e.getMessage());
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public int countBooksByAuthor(String authorName, int index) {
        if (index >= bookCount) {
            return 0;
        }
        int count = 0;
        Book b = books[index];
        if (b.getAuthor().equalsIgnoreCase(authorName)) {
            count = 1;
        }
        return count + countBooksByAuthor(authorName, index + 1);
    }

    public void printAllBooks() {
        System.out.println("Full Library Status:");
        for (int i = 0; i < bookCount; i++) {
            Book b = books[i];
            System.out.println("Name: " + b.getName() + " | Author: " + b.getAuthor() + " | " + b.getStatus());
        }
    }

}

public class Question1 {
    public static void main(String args[]) {

        Library lib = new Library();

        NormalBook b1 = new NormalBook(1, "Java", "James", "available");
        NormalBook b2 = new NormalBook(2, "Python", "Guido", "available");
        ReferenceBook b3 = new ReferenceBook(3, "Encyclopedia", "Oxford", "available");
        NormalBook b4 = new NormalBook(4, "C++", "Bjarne", "available");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        lib.addBook(b4);

        try {
            lib.issueBookToStudent(1);
            lib.issueBookToStudent(2);
            lib.issueBookToStudent(4);
            lib.issueBookToStudent(3);
        } catch (IssueLimitException e) {
            System.out.println(e.getMessage());
        }

        try {
            lib.issueBookToStudent(3);
        } catch (IssueLimitException e) {
            System.out.println(e.getMessage());
        }

        try {
            lib.issueBookToStudent(10);
        } catch (IssueLimitException e) {
            System.out.println(e.getMessage());
        }

        int count = lib.countBooksByAuthor("James", 0);
        System.out.println("Books by James: " + count);

        lib.printAllBooks();

    }

}
