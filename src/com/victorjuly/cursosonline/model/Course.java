package com.victorjuly.cursosonline.model;

public class Course {
    
    public static enum Category {
        TECNOLOGIA, DESIGN, COSTURA, CULINÁRIA, DESENHO;
    }
    
    private int id;
    private String title;
    private double price;
    private String owner;
    private int duration;
    private String description;
    private Category type;

    public Course(String title, double price, String owner, int duration, String description, Category type) {
        this.title = title;
        this.id = id;
        this.price = price;
        this.owner = owner;
        this.duration = duration;
        this.description = description;
        this.type = type;
    }
    
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getOwner() {
        return owner;
    }

    public int getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return type;
    }
    
}