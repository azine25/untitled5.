package com.company;

public class Building implements Printable{

    private String name;
    private int height;
    private String  material;
    private String color;

    public Building(String name, int height, String material, String color) {
        this.name = name;
        this.height = height;
        this.material = material;
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(  getClass().getSimpleName() +
                " Name: "+name+"\n" +
                "Height: "+ height+"\n" +
                "Material: "+ material+"\n" +
                "Color: "+color);

    }
}
