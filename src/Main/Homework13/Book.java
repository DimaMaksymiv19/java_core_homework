package Main.Homework13;

public class Book {
    private String name;
    String author;
    public int numPages;

    public Book(){

    }

    public Book(String name, String author, int numPages) {
        this.name = name;
        this.author = author;
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    private void addPages(int num){
        this.numPages += num;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}
