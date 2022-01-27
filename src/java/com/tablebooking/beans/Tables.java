
package com.tablebooking.beans;


public class Tables {
    private int restaurantId;
    private int capacity;
    private int avalability;
    private boolean status;

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
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the avalability
     */
    public int getAvalability() {
        return avalability;
    }

    /**
     * @param avalability the avalability to set
     */
    public void setAvalability(int avalability) {
        this.avalability = avalability;
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

