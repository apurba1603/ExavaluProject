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
    private int price;
    private boolean status;

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
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

   
}
