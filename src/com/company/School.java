package com.company;

public class School extends Building implements Printable {

   private int numberClass;

    public School(String name, int height, String material, String color, int numberClass) {
        super(name, height, material, color);
        this.numberClass = numberClass;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("" +
                "Quantity: "+numberClass+"\n");
    }

}
