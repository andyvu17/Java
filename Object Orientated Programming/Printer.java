package com.Andyvu;

public class Printer {
    private int tonerLevel;
    private boolean isDuplex;
    private int pagesPrinted;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public void fillToner() {
        System.out.println("Toner has been filled to 100");
        this.tonerLevel = 100;
    }

    public void print(int pages) {
        int pagesToPrint = pages;
        if(isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
        }
        this.pagesPrinted += pagesToPrint;
        System.out.println("Printing " + pagesToPrint + " pages");
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
