package tech.dar;

import tech.dar.practice6.Author;
import tech.dar.practice6.Book;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", new Author("J.K.R."), 2001);
        Book book2 = book1;
        Book book3 = book1.clone();

        System.out.println(book1.equals(book3));

        book1.title = "Hello world";
        book1.author.name = "Smith";
        book3.year = 2009;

        System.out.println(book1);
        System.out.println(book3);
        System.out.println(book1.equals(book3));

    }
}
