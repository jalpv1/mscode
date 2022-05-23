package com.company;

public class BookComparable implements Comparable<Book> {
    private int amountOfPages;

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.amountOfPages, o.getAmountOfPages());
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
}
