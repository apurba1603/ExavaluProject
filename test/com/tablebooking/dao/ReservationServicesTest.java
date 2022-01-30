/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.tablebooking.dao;

import com.tablebooking.beans.Reservations;
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
public class ReservationServicesTest {
    
    public ReservationServicesTest() {
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
     * Test of makeReservation method, of class ReservationServices.
     */
    @Test
    public void testMakeReservation() throws Exception {
        System.out.println("makeReservation");
        int restaurantId = 1;
        int customerId = 1;
        String dateTime = "27th Jan 12.00-12.30PM";
        int bookedTable = 1;
        int orderId = 1;
        ReservationServices instance = new ReservationServices();
        int expResult = 1;
        int result = instance.makeReservation(restaurantId, customerId, dateTime, bookedTable, orderId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of showAllReservations method, of class ReservationServices.
     */
    @Test
    public void testShowAllReservations() throws Exception {
        System.out.println("showAllReservations");
        ReservationServices instance = new ReservationServices();
        List expResult = null;
        List result = instance.showAllReservations();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchReservationDetails method, of class ReservationServices.
     */
    @Test
    public void testFetchReservationDetails() throws Exception {
        System.out.println("fetchReservationDetails");
        int reservationId = 1;
        ReservationServices instance = new ReservationServices();
        Reservations expResult = null;
        Reservations result = instance.fetchReservationDetails(reservationId);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateReservationDetails method, of class ReservationServices.
     */
    @Test
    public void testUpdateReservationDetails() throws Exception {
        System.out.println("updateReservationDetails");
        int reservationId = 1;
        int restaurantId = 1;
        int customerId = 1;
        String dateTime = "27th Jan 12.00-12.30PM";
        int bookedTable = 2;
        int orderId = 1;
        ReservationServices instance = new ReservationServices();
        int expResult = 1;
        int result = instance.updateReservationDetails(reservationId, restaurantId, customerId, dateTime, bookedTable, orderId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelReservation method, of class ReservationServices.
     */
    @Test
    public void testCancelReservation() throws Exception {
        System.out.println("cancelReservation");
        int reservationId = 1;
        ReservationServices instance = new ReservationServices();
        int expResult = 1;
        int result = instance.cancelReservation(reservationId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
