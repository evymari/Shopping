package Shopping;

import jdk.jfr.Description;

public class Book extends Product{
    private String author;
    private String description;

    public Book(String name, double price,String author, String description) {
        super(name, price);
        this.author = author;
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }
}
