package org.example;

public class Dish
{
    private String dishId;
    private String dishName;
    private String restroId;
    float dishPrice;
    public void setDishId(String dishId) {
        this.dishId = dishId;
    }
    public void setDishName(String dishName) {
        this.dishName = dishName;
    }
    public void setDishPrice(float dishPrice) {
        this.dishPrice = dishPrice;
    }
    public void setRestroId(String restroId) {
        this.restroId = restroId;
    }
    public String getDishId() {
        return dishId;
    }
    public String getDishName() {
        return dishName;
    }
    public float getDishPrice() {
        return dishPrice;
    }
    public String getRestroId() {
        return restroId;
    }
}
