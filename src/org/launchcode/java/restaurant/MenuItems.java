package org.launchcode.java.restaurant;
import java.util.Date;
public class MenuItems {

    private String name;
    private double price;
    private String description;
    private String category;
    private Boolean newOrNot;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNewOrNot() {
        return newOrNot;
    }

    public void setNewOrNot(Boolean newOrNot) {
        this.newOrNot = newOrNot;
    }



public MenuItems(double price, String description, String category, Boolean newOrNot, String name){
    this.price = price;
    this.description = description;
    this.category = category;
    this.newOrNot = newOrNot;
    this.name = name;
    }

}
