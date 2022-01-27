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
public class OrderServicesTest {
    
    public OrderServicesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of registerOrder method, of class OrderServices.
     */
    @Test
    public void testRegisterOrder() throws Exception {
        System.out.println("registerOrder");
        int orderId = 1;
        int restaurantId = 101;
        int customerId = 12;
        int items = 5;
        OrderServices instance = new OrderServices();
        int expResult = 1;
        int result = instance.registerOrder(orderId, restaurantId, customerId, items);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
