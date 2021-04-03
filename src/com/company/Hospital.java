package com.company;

public class Hospital extends Building implements Printable{

  private int ward;

    public Hospital(String name, int height, String material, String color, int ward) {
        super(name, height, material, color);
        this.ward = ward;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("" +
                "Ward: "+ward+"\n");
    }

}

