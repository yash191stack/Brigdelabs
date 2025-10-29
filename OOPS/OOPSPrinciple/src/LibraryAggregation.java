import java.util.*;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}

class Library {
    private String name;
    private List<Book> books = new ArrayList<>();

    public Library(String name) { this.name = name; }

    public void addBook(Book book) { books.add(book); }

    public void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books)
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        System.out.println("-------------------");
    }
}

public class LibraryAggregation {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("The Alchemist", "Paulo Coelho");
        Book b3 = new Book("Wings of Fire", "A.P.J. Abdul Kalam");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("University Library");

        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2);
        lib2.addBook(b3);

        lib1.showBooks();
        lib2.showBooks();
    }
}
