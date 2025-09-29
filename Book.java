public class Book {
    String title;
    String author;
    int yearPublished;
    double price;
    
    public Book(String t, String a, int year, double p) {
        title = t;
        author = a;
        yearPublished = year;
        price = p;
    }
    
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + price;
    }
}