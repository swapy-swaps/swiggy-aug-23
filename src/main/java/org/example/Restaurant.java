package org.example;

import java.util.List;

public class Restaurant
{
    private String restroID;
    private String restroName;
    private Location loc;
    private List<Dish> menu;
    public void setRestroID(String restroID) {
        this.restroID = restroID;
    }
    public void setRestroName(String restroName) {
        this.restroName = restroName;
    }
    public void setLoc(Location loc) {
        this.loc = loc;
    }
    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }
    public String getRestroID() {
        return restroID;
    }
    public String getRestroName() {
        return restroName;
    }
    public Location getLoc() {
        return loc;
    }
    public List<Dish> getMenu() {
        return menu;
    }
}
