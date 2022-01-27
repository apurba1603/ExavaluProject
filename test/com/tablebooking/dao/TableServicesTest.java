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
public class TableServicesTest {
    
    public TableServicesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of registerTable method, of class TableServices.
     */
    @Test
    public void testRegisterTable() throws Exception {
        System.out.println("registerTable");
        int restaurantId = 102;
        int capacity = 5;
        int avalability = 20;
        TableServices instance = new TableServices();
        int expResult = 1;
        int result = instance.registerTable(restaurantId, capacity, avalability);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
