/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tablebooking.dao;

import com.tablebooking.beans.Customer;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amankumar
 */
public class CustomerServicesTest {
    
    public CustomerServicesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of registerCustomer method, of class CustomerServices.
     */
    @Test
    public void testRegisterCustomer() throws Exception {
        System.out.println("registerCustomer");
        int customerId = 1;
        String customerName = "Rahul";
        String customerAddrees = "Ranchi";
        String email = "rahul@gmail.com";
        String phoneNumber = "1234567891";
        CustomerServices instance = new CustomerServices();
        int expResult = 1;
        int result = instance.registerCustomer(customerId, customerName, customerAddrees, email, phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of report method, of class CustomerServices.
//     */
//    @Test
//    public void testReport() throws Exception {
//        System.out.println("report");
//        CustomerServices instance = new CustomerServices();
//        List expResult = null;
//        List result = instance.report();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of fetchCustomerDetails method, of class CustomerServices.
//     */
//    @Test
//    public void testFetchCustomerDetails() throws Exception {
//        System.out.println("fetchCustomerDetails");
//        Integer customerId = null;
//        CustomerServices instance = new CustomerServices();
//        Customer expResult = null;
//        Customer result = instance.fetchCustomerDetails(customerId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateCustomerDetails method, of class CustomerServices.
//     */
//    @Test
//    public void testUpdateCustomerDetails() throws Exception {
//        System.out.println("updateCustomerDetails");
//        Integer customerId = null;
//        String customerName = "";
//        String customerAddrees = "";
//        String email = "";
//        String phoneNumber = "";
//        CustomerServices instance = new CustomerServices();
//        int expResult = 0;
//        int result = instance.updateCustomerDetails(customerId, customerName, customerAddrees, email, phoneNumber);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteCustomerDetails method, of class CustomerServices.
//     */
//    @Test
//    public void testDeleteCustomerDetails() throws Exception {
//        System.out.println("deleteCustomerDetails");
//        Integer customerId = null;
//        CustomerServices instance = new CustomerServices();
//        int expResult = 0;
//        int result = instance.deleteCustomerDetails(customerId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
