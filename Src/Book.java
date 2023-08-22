public class Book {
    public String name;
    public String author;
    public int isbn;
    public boolean cover;

    public Book(String name, String author, int isbn, boolean cover) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.cover = cover;
    }

//    public Book(String name) {
//        this.name = name;
//    }
//
//    public Book(String name, String author) {
//        this.name = name;
//        this.author = author;
//    }
//
//    public Book(String name, int isbn, boolean cover) {
//        this.name = name;
//        this.isbn = isbn;
//        this.cover = cover;
//    }
//
//    public Book(int isbn, boolean cover) {
//        this.isbn = isbn;
//        this.cover = cover;
//    }
//
//    public Book() {
//    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", cover=" + (cover ? "hard" : "soft") +
                '}';
    }
}
