/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.tablebooking.dao;

import com.tablebooking.beans.Restaurant;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Apu
 */
public class RestaurantServicesTest {
    
    public RestaurantServicesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of registerNewRestaurant method, of class RestauranServices.
     */
//    @Test
//    public void testRegisterNewRestaurant() throws Exception {
//        System.out.println("registerNewRestaurant");
//        String restaurantName = "Peter Cat";
//        String location = "Park Street";
//        String timings = "11am–11:20pm";
//        RestaurantServices instance = new RestaurantServices();
//        int expResult = 1;
//        int result = instance.registerNewRestaurant(restaurantName, location, timings);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of showAllRestaurants method, of class RestaurantServices.
     */
    @Test
    public void testShowAllRestaurants() throws Exception {
        System.out.println("showAllRestaurants");
        RestaurantServices instance = new RestaurantServices();
        List expResult = null;
        List result = instance.showAllRestaurants();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchRestaurantDetails method, of class RestaurantServices.
     */
    @Test
    public void testFetchRestaurantDetails() throws Exception {
        System.out.println("fetchRestaurantDetails");
        int restaurantId = 1;
        RestaurantServices instance = new RestaurantServices();
        Restaurant expResult = null;
        Restaurant result = instance.fetchRestaurantDetails(restaurantId);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRestaurantDetails method, of class RestaurantServices.
     */
    @Test
    public void testUpdateRestaurantDetails() throws Exception {
        System.out.println("updateRestaurantDetails");
        int restaurantId = 1;
        String restaurantName = "Peter Cat";
        String location = "Park Street";
        String timings = "11AM–11:20PM";
        RestaurantServices instance = new RestaurantServices();
        int expResult = 1;
        int result = instance.updateRestaurantDetails(restaurantId, restaurantName, location, timings);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRestaurant method, of class RestaurantServices.
     */
    @Test
    public void testDeleteRestaurant() throws Exception {
        System.out.println("deleteRestaurant");
        int restaurantId = 1;
        RestaurantServices instance = new RestaurantServices();
        int expResult = 1;
        int result = instance.deleteRestaurant(restaurantId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
