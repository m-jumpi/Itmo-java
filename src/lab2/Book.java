package lab2;

public class Book {
    String title;
    String author;
    String publisher;
    int pages;
    long price;

    public Book(){
    }

    public Book(String title, String author, String publisher, int pages, long price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }
}
