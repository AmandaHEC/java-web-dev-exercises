package org.launchcode.java.restaurant;
import java.util.Date;

public class Menu {
    private String lunch;
    private String dinner;
    private String dessert;
    private String appetizer;
    private String breakfast;
    private Integer Date;

    public Menu(String breakfast, String lunch, String dinner, String dessert, String appetizer, Integer Date) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
        this.dessert = dessert;
        this.appetizer = appetizer;
        this.Date = Date;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }


    public Integer getDate() {
        return Date;
    }

    public void setDate(Integer date) {
        Date = date;
    }



}
