package company;

public class BookComparable implements Comparable<BookComparable> {
    private int amountOfPages;
    private String bookName;

    @Override
    public int compareTo(BookComparable o) {
        return Integer.compare(this.amountOfPages, o.getAmountOfPages());
    }

    public BookComparable(int amountOfPages, String bookName) {
        this.amountOfPages = amountOfPages;
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public BookComparable(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    @Override
    public String toString() {
        return "BookComparable{" +
                "amountOfPages=" + amountOfPages +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
