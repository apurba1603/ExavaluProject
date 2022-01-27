/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Struts2/ActionSupport.java to edit this template
 */
package com.tablebooking.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.tablebooking.beans.Restaurant;
import com.tablebooking.beans.User;
import com.tablebooking.dao.RestaurantServices;
import com.tablebooking.dao.UserServices;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Apu
 */
public class RestaurantAction extends ActionSupport {
    
    private int restaurantId;
    private String restaurantName;
    private String location;
    private String timings;
    private String submitType;
    private ResultSet rs = null;
    private Restaurant restaurant = null;
    private boolean noData = false;
    private RestaurantServices restaurantServices = null;
    private List<Restaurant> restaurantList = null;
    
    public String showRestaurants() throws Exception {
        setRestaurantServices(new RestaurantServices());
        try {
            setRestaurantList(new ArrayList<Restaurant>());
            setRestaurantList(restaurantServices.showAllRestaurants());

            if (!restaurantList.isEmpty()) {
                setNoData(false);
                System.out.println("Restaurant retrieve = " + getRestaurantList().size());
                System.out.println("setting nodata=false");
            } else {
                setNoData(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "RESTAURANTS";
    }

    /**
     * @return the restaurantId
     */
    public int getRestaurantId() {
        return restaurantId;
    }

    /**
     * @param restaurantId the restaurantId to set
     */
    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    /**
     * @return the restaurantName
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * @param restaurantName the restaurantName to set
     */
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the timings
     */
    public String getTimings() {
        return timings;
    }

    /**
     * @param timings the timings to set
     */
    public void setTimings(String timings) {
        this.timings = timings;
    }

    /**
     * @return the submitType
     */
    public String getSubmitType() {
        return submitType;
    }

    /**
     * @param submitType the submitType to set
     */
    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }

    /**
     * @return the rs
     */
    public ResultSet getRs() {
        return rs;
    }

    /**
     * @param rs the rs to set
     */
    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    /**
     * @return the restaurant
     */
    public Restaurant getRestaurant() {
        return restaurant;
    }

    /**
     * @param restaurant the restaurant to set
     */
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    /**
     * @return the noData
     */
    public boolean isNoData() {
        return noData;
    }

    /**
     * @param noData the noData to set
     */
    public void setNoData(boolean noData) {
        this.noData = noData;
    }

    /**
     * @return the restaurantServices
     */
    public RestaurantServices getRestaurantServices() {
        return restaurantServices;
    }

    /**
     * @param restaurantServices the restaurantServices to set
     */
    public void setRestaurantServices(RestaurantServices restaurantServices) {
        this.restaurantServices = restaurantServices;
    }

    /**
     * @return the restaurantList
     */
    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    /**
     * @param restaurantList the restaurantList to set
     */
    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
}
