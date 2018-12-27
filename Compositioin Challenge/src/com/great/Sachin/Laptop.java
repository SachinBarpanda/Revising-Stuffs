package com.great.Sachin;

public class Laptop {
    private int processor;
    private int ram;
    private  int harddisk;
    private String Battery;

    public Laptop(int processor, int ram, int harddisk, String battery) {
        this.processor = processor;
        this.ram = ram;
        this.harddisk = harddisk;
        this.Battery = battery;
    }

    public int getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getHarddisk() {
        return harddisk;
    }

    public String getBattery() {
        return Battery;
    }

    public void watchMovie(){
      System.out.println("Ferrari ki sawari"+processor+ram+harddisk+Battery+"Is powered");

    }
}
