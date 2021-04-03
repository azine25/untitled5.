package com.company;

public class House extends Building implements Printable {

   private int room;

    public House(String name, int height, String material, String color, int room) {
        super(name, height, material, color);
        this.room = room;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("" +
                "Rooms: " + room+"\n");
    }
}
