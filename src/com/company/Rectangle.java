package com.company;

import java.util.Objects;
/*
*
* Classame : Rectangle
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

public class Rectangle{

    private int length;
    private int width;
    public final double PI = 3.14;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea(){
        return this.getLength() * this.getWidth();
    }


    public boolean isQuadrat(){
        return (this.getLength() == this.getWidth());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getLength() == rectangle.getLength() &&
                getWidth() == rectangle.getWidth() &&
                Double.compare(rectangle.PI, PI) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth(), PI);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                ", length = " + length +
                ", width = " + width +
                '}';
    }


}
