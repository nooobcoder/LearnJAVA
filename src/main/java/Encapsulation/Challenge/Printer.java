package main.java.Encapsulation.Challenge;

public class Printer {
    private int tonerLevel, pagesPrinted;
    private boolean duplex; //Whether a duplex printer or not

    public Printer(int tonerLevel, boolean duplex) {
        // Doing validation
        if (tonerLevel >= 1 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        else this.tonerLevel = -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) // Toner overflows
                return -1;
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted = pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
