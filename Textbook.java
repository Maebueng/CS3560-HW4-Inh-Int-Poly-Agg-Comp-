public class Textbook {
    private String title;
    private String author;
    private String publisher;

    // default
    public Textbook() {
        this.title = "Book 101";
        this.author = "John Doe";
        this.publisher = "We Make Books! Co.";
    }

    // parameterized
    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    // setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Textbook: " + title + " | Author: " + author + " | Published by: " + publisher;
    }
}