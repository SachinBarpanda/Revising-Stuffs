package com.great.Sachin;

public class Printer {
    private int tonerLevel;
    private static int pagesPrinted=0;
    private boolean duplex ;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel>0 && tonerLevel<100)this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    //fill toner up
    public void tonerFill(int toner){
        if(toner>0 && tonerLevel<100){
             tonerLevel = tonerLevel + toner;
            System.out.println("Toner added, now total toner is : " + tonerLevel);
        }
    }

    //Capable of printing both side
    public boolean canDuplex (){
        if(duplex){
            //System.out.println("Printing both side " );
            return true;
        }
        return false;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }

    //print a page ,if possible and increase the count,decrease the toner

    public void print(int pages){
        for(int i =0 ;i < pages;i++) {
            if(tonerLevel > 10 && canDuplex()) {
                System.out.println("Printing both side " + (i + 1)+ " & "+ (i+2) + "page");
                tonerLevel = tonerLevel - 20;
                i = i + 1;
            }
            else if (tonerLevel > 10) {
                    System.out.println("Printing " + (i + 1)+  " page ");
                    tonerLevel = tonerLevel - 10;
                }
            else {
                System.out.println("Please provide more toner");
            }
            pagesPrinted++;
        }
    }
}
