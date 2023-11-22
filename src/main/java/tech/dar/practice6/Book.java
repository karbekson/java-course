package tech.dar.practice6;

public class Book {

    public String title;
    public Author author;
    public int year;

    public Book() {
    }

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\nAuthor: " + this.author.name + "\nYear: " + year;
    }

    public Book clone() {
        return new Book(this.title, new Author(this.author.name), this.year);
    }

    @Override
    public int hashCode() {
        int code = 0;
        String s = title + author + year;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            code += c;
        }
        return code;
    }

    public boolean equals(Book book) {
        return this.title.equals(book.title) && this.author.name.equals(book.author.name) && this.year == book.year;
    }

}
