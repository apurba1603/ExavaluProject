/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tablebooking.dao;

import com.tablebooking.beans.User;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amankumar
 */
public class UserServicesTest {
    
    public UserServicesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of registerUser method, of class UserServices.
     */
    @Test
    public void testRegisterUser() throws Exception {
        System.out.println("registerUser");
        String userName = "Aman";
        String password = "12345";
        String firstName = "Aman";
        String lastName = "Kumar";
        String email = "abc@gmail.com";
        String phoneNumber = "8877031397";
        UserServices instance = new UserServices();
        int expResult = 1;
        int result = instance.registerUser(userName, password, firstName, lastName, email, phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}

//    /**
//     * Test of report method, of class UserServices.
//     */
//    @Test
//    public void testReport() throws Exception {
//        System.out.println("report");
//        UserServices instance = new UserServices();
//        List expResult = null;
//        List result = instance.report();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of fetchUserDetails method, of class UserServices.
//     */
//    @Test
//    public void testFetchUserDetails() throws Exception {
//        System.out.println("fetchUserDetails");
//        String userName = "";
//        UserServices instance = new UserServices();
//        User expResult = null;
//        User result = instance.fetchUserDetails(userName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateUserDetails method, of class UserServices.
//     */
//    @Test
//    public void testUpdateUserDetails() throws Exception {
//        System.out.println("updateUserDetails");
//        String userName = "";
//        String password = "";
//        String firstName = "";
//        String lastName = "";
//        String email = "";
//        String phoneNumber = "";
//        UserServices instance = new UserServices();
//        int expResult = 0;
//        int result = instance.updateUserDetails(userName, password, firstName, lastName, email, phoneNumber);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteUserDetails method, of class UserServices.
//     */
//    @Test
//    public void testDeleteUserDetails() throws Exception {
//        System.out.println("deleteUserDetails");
//        String userName = "";
//        UserServices instance = new UserServices();
//        int expResult = 0;
//        int result = instance.deleteUserDetails(userName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of validateLoginCredentials method, of class UserServices.
//     */
//    @Test
//    public void testValidateLoginCredentials() throws Exception {
//        System.out.println("validateLoginCredentials");
//        String userName = "";
//        String password = "";
//        UserServices instance = new UserServices();
//        User expResult = null;
//        User result = instance.validateLoginCredentials(userName, password);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    

