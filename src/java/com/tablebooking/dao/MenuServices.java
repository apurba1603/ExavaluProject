/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tablebooking.dao;

import com.tablebooking.core.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author amankumar
 */
public class MenuServices {
     public int registerMenu(String foodItems, Integer price
            ) throws Exception { 
         int i = 0;
        Connection con = null;
         try {
        con = ConnectionManager.getConnection();
         String sql = "INSERT INTO menu (foodItems,price) VALUES (?,?)";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setString(1, foodItems);
         ps.setInt(2, price);
         System.out.println("SQL for insert=" + ps);
         i = ps.executeUpdate(); 
         return i;
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        } finally {
            if (con != null) {
                con.close();
            }
         }
    }

}
