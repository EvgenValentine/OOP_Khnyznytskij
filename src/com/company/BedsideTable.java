package com.company;

/*
*
* Classame : BedsideTable
*
*  07 June 2020
*
* Copyright Khnyznytskyj Evgen
*
*  Module 2 task 2
*
1. Create a child  from the class Rectangle.
2. Create another class as a super class for your one.  Or create a daughterly class for your one.
*
* */
public class BedsideTable extends RectangularBox{
    private String material;
    private String colour;
    private int numberOfDrawers;
    private int price;
    private String producer;
    private String materialOfHandles;

    public BedsideTable(double height, double length, double width,
                        String material, String colour, int numberOfDrawers,
                        int price, String producer, String materialOfHandles) {
        super(height, length, width);
        this.material = material;
        this.colour = colour;
        this.numberOfDrawers = numberOfDrawers;
        this.price = price;
        this.producer = producer;
        this.materialOfHandles = materialOfHandles;
    }

    public BedsideTable(String material, String colour, int numberOfDrawers, int price, String producer, String materialOfHandles) {
        this.material = material;
        this.colour = colour;
        this.numberOfDrawers = numberOfDrawers;
        this.price = price;
        this.producer = producer;
        this.materialOfHandles = materialOfHandles;
    }
}
