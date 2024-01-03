package tech.dar.practice11.open_closed;

public class Printer {

    public void print(String text) {
        System.out.println(text);
    }

    // Add new function, don't change upper initial method
    public void printColor(String text, String color) {
        System.out.println(color+ ": " + text);
    }

}
