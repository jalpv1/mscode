package company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainFindMax {
//    public static void main(String[] args) {
//        // find maximum value integer
//        System.out.println("----------------find maximum value integer---------------------------");
//
//        System.out.println("Maximum integer " + findMax(0,5,2));
//        // find maximum value long
//        System.out.println("----------------find maximum value long---------------------------");
//        System.out.println("Maximum long " + findMax(400000L,700000L,200000L));
//
//        // find maximum value String
//        System.out.println("----------------find maximum value string---------------------------");
//        System.out.println("Maximum String " + findMax('l','c','b'));
//
//        System.out.println("----------------find maximum value Objects---------------------------");
//        //Find maximum among objects that do not implement Comparable
//        System.out.println("Do not Implement comparable: ");
//        Book book1 = new Book(100, "Pride and Prejudice");
//        Book book2 = new Book(120, "Winnie the Pooh");
//        Book book3 = new Book(300, "To Kill a Mockingbird");
//        System.out.println("Book with maximum number of pages is " + findMax(book1, book3, book2));
//        //Find maximum among objects that do not implement Comparable
//        System.out.println("Implement comparable: ");
//        BookComparable bookComparable1 = new BookComparable(100, "Pride and Prejudice");
//        BookComparable bookComparable2 = new BookComparable(120, "Winnie the Pooh");
//        BookComparable bookComparable3 = new BookComparable(300, "To Kill a Mockingbird");
//        BookComparable bookComparableMax = findMax(bookComparable3, bookComparable1, bookComparable2);
//        System.out.println("Book with maximum number of pages is " + bookComparableMax.getBookName() + " with number of pages is " + bookComparableMax.getAmountOfPages());
//    }
//    public static void main(String[] args) {
//        // find maximum value integer
//        System.out.println("----------------find maximum value integer---------------------------");
//        System.out.println("Input: " + " 0,5,2 ");
//        System.out.println("Output: " + findMax(0,5,2));
//        // find maximum value long
//        System.out.println("----------------find maximum value long---------------------------");
//        System.out.println("Input: " + " 400000,700000,200000 ");
//        System.out.println("Output " + findMax(400000L,700000L,200000L));
//
//        // find maximum value String
//        System.out.println("----------------find maximum value string---------------------------");
//        System.out.println("Input: " + " 'l','c','b' ");
//        System.out.println("Output " + findMax('l','c','b'));
//
//    }

    public static void main(String[] args) {
        System.out.println("----------------find maximum value Objects---------------------------");
        //Find maximum among objects that do not implement Comparable
        System.out.println("Do not Implement comparable: ");
        Book book1 = new Book(100, "Pride and Prejudice");
        Book book2 = new Book(120, "Winnie the Pooh");
        Book book3 = new Book(300, "To Kill a Mockingbird");
        System.out.println("Input: " + book1 + " " + book2 + " " + book3);
        System.out.println("Output: " + findMax(book1, book3, book2));
        //Find maximum among objects that do not implement Comparable
        System.out.println("Implement comparable: ");
        BookComparable bookComparable1 = new BookComparable(100, "Pride and Prejudice");
        BookComparable bookComparable2 = new BookComparable(120, "Winnie the Pooh");
        BookComparable bookComparable3 = new BookComparable(300, "To Kill a Mockingbird");
        System.out.println("Input: " + bookComparable1 + " " + bookComparable2 + "\n " + bookComparable3);
        System.out.println("Output: " + findMax(bookComparable3, bookComparable1, bookComparable2));
    }

    static <T> T findMax(T t1, T t2, T t3) {
        if (t1 instanceof Comparable && t2 instanceof Comparable && t3 instanceof Comparable) {
            T currentMax = t1;
            List<T> values = Arrays.asList(t1, t2, t3);
            for (T value : values) {
                if (((Comparable<T>) value).compareTo(currentMax) > 0) {
                    currentMax = value;
                }
            }
            return currentMax;
        }
        return null;
    }
}
