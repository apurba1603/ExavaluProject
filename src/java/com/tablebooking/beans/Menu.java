/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tablebooking.beans;

/**
 *
 * @author amankumar
 */
public class Menu {
    private String foodItems;
    private Double price;

    /**
     * @return the foodItems
     */
    public String getFoodItems() {
        return foodItems;
    }

    /**
     * @param foodItems the foodItems to set
     */
    public void setFoodItems(String foodItems) {
        this.foodItems = foodItems;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    
}
