package tech.dar.practice11.liskov;

public class ColorfulPrinter extends Printer {

    // Implement custom function of the parent class without losing the main purpose
    @Override
    public void print(String text) {
        System.out.println("Default color BLUE: " + text);
    }

}
