package com.example.demo;

public class BookComparable implements Comparable<BookComparable> {
    private int amountOfPages;

    @Override
    public int compareTo(BookComparable o) {
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
