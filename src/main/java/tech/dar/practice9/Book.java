package tech.dar.practice9;

/*
    Book book = new Book("Harry Potter", "Some cool book!");
    book.getDescription().print();
 */
public class Book {

    private String title;
    private Description description;

    public Book(String title, String text) {
        this.title = title;
        this.description = new Description(text);
    }

    public Description getDescription() {
        return description;
    }

    class Description {

        private String text;

        public Description(String text) {
            this.text = text;
        }

        public void print() {
            System.out.println("Title: " + title);
            System.out.println("Description: " + text);
        }

    }

}
