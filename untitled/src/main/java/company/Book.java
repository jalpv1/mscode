package company;

public class Book {
    private int amountOfPages;
    private String bookName;

    public Book(int amountOfPages, String bookName) {
        this.amountOfPages = amountOfPages;
        this.bookName = bookName;
    }

    public Book(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "amountOfPages=" + amountOfPages +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
