package tech.dar.practice12;

import java.util.Arrays;
import java.util.List;

import javax.print.DocFlavor;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.print.attribute.standard.Sides;

/**
 * Printing services available to a desktop client.
 */
public final class LazyInitExample {

    /**
     * Print some plain text (perhaps internally converted to PDF).
     */
    void printSomething(String text, PrintService printer) {
        //...elided
    }

    /**
     * Return the list of printers that can print PDFs (double-sided, portrait).
     */
    List<PrintService> listAvailablePrinters() {
        if (availablePrinters == null) {
            //double-sided, portrait, for PDF files.
            PrintRequestAttributeSet attrs = new HashPrintRequestAttributeSet();
            attrs.add(Sides.DUPLEX);
            attrs.add(OrientationRequested.PORTRAIT);
            //Expensive operation! This can take several seconds in some environments:
            availablePrinters = Arrays.asList(
                    PrintServiceLookup.lookupPrintServices(DocFlavor.INPUT_STREAM.PDF, attrs)
            );
        }
        return availablePrinters;
    }

    // PRIVATE

    /**
     * Looked up once, the first time it's needed, and then stored using a
     * static reference. If it was a non-static reference, then
     * the list of available printers would not be looked up just once,
     * but perhaps many times (once per 'Printers' object, and not once per
     * loaded 'Printers' class).
     * <p>
     * Self-encapsulate:
     * If this class's implementation needs to reference this item, it must do
     * so indirectly, by calling listAvailablePrinters().
     */
    private static List<PrintService> availablePrinters;

}