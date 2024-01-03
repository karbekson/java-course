package tech.dar.practice11;


import tech.dar.practice11.liskov.ColorfulPrinter;
import tech.dar.practice11.liskov.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello");

        Printer colorfulPrinter = new ColorfulPrinter();
        colorfulPrinter.print("Hello");

    }
}
