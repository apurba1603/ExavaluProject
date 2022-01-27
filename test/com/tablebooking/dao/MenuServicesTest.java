/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tablebooking.dao;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amankumar
 */
public class MenuServicesTest {
    
    public MenuServicesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of registerMenu method, of class MenuServices.
     */
    @Test
    public void testRegisterMenu() throws Exception {
        System.out.println("registerMenu");
        String foodItems = "pizza";
        Integer price = 100;
        MenuServices instance = new MenuServices();
        int expResult = 1;
        int result = instance.registerMenu(foodItems, price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
