package tech.dar.practice11.single_responsibility;

public class OfficeManager {

    private final Printer printer;
    private final Scanner scanner;
    private final Fax fax;

    public OfficeManager(Printer printer, Scanner scanner, Fax fax) {
        this.printer = printer;
        this.scanner = scanner;
        this.fax = fax;
    }

}
