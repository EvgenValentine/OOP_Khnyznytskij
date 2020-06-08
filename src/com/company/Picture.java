package com.company;
/*
*
* Classname : Picture
*
*  07 June 2020
*
* Copyright Khnyznytskyj Evgen
*
*  Module 2 task 2
*
* Create a class from the attached document according to the order in your group .  The class must contain
1. Create a child  from the class Rectangle.
2. Create another class as a super class for your one.  Or create a daughterly class for your one.
*
* */
public class Picture extends Rectangle{
    private String author;
    private String year;
    private String owner;
    private boolean isForSale;
    private double price;
    private String name;
    private String subjectOfPicture;
    private String pictureFrameMaterial;
    private String mainColours;
    private String typeOfFixture;
    private String description;

    public Picture(int length, int width, String author, String year,
                   String owner, boolean isForSale, double price,
                   String name, String subjectOfPicture,
                   String pictureFrameMaterial, String mainColours,
                   String typeOfFixture, String description) {
        super(length, width);
        this.author = author;
        this.year = year;
        this.owner = owner;
        this.isForSale = isForSale;
        this.price = price;
        this.name = name;
        this.subjectOfPicture = subjectOfPicture;
        this.pictureFrameMaterial = pictureFrameMaterial;
        this.mainColours = mainColours;
        this.typeOfFixture = typeOfFixture;
        this.description = description;
    }

    public Picture(String author, String year, String owner, boolean isForSale, double price, String name, String subjectOfPicture, String pictureFrameMaterial, String mainColours, String typeOfFixture, String description) {
        this.author = author;
        this.year = year;
        this.owner = owner;
        this.isForSale = isForSale;
        this.price = price;
        this.name = name;
        this.subjectOfPicture = subjectOfPicture;
        this.pictureFrameMaterial = pictureFrameMaterial;
        this.mainColours = mainColours;
        this.typeOfFixture = typeOfFixture;
        this.description = description;
    }

    public Picture(int length, int width) {
        super(length, width);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isForSale() {
        return isForSale;
    }

    public void setForSale(boolean forSale) {
        isForSale = forSale;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectOfPicture() {
        return subjectOfPicture;
    }

    public void setSubjectOfPicture(String subjectOfPicture) {
        this.subjectOfPicture = subjectOfPicture;
    }

    public String getPictureFrameMaterial() {
        return pictureFrameMaterial;
    }

    public void setPictureFrameMaterial(String pictureFrameMaterial) {
        this.pictureFrameMaterial = pictureFrameMaterial;
    }

    public String getMainColours() {
        return mainColours;
    }

    public void setMainColours(String mainColours) {
        this.mainColours = mainColours;
    }

    public String getTypeOfFixture() {
        return typeOfFixture;
    }

    public void setTypeOfFixture(String typeOfFixture) {
        this.typeOfFixture = typeOfFixture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
