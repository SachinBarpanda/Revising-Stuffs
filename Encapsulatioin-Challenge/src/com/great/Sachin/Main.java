package com.great.Sachin;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(20,true);
        printer.print(2);
        printer.tonerFill(50);
        printer.print(3);
        System.out.println("Number of pages printed"+ printer.getPagesPrinted());
    }
}
