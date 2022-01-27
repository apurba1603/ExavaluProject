
package com.tablebooking.dao;

import com.mysql.cj.xdevapi.Table;
import com.tablebooking.beans.Order;
import com.tablebooking.core.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class TableServices {
     public int registerTable(int restaurantId, int capacity, int avalability
            ) throws Exception { 
         int i = 0;
        Connection con = null;
         try {
        con = ConnectionManager.getConnection();
         String sql = "INSERT INTO tables (restaurantId,capacity,avalability) VALUES (?,?,?)";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setInt(1, restaurantId);
         ps.setInt(2, capacity);
         ps.setInt(3, avalability);
        
        
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
      
     
    public List report() throws SQLException, Exception {
        ResultSet rs = null;
        Connection con = null;
        List<Table> tableList = new ArrayList<>();
        try {
            String sql = "SELECT restaurantId, capacity, avalability FROM tables";
            con = ConnectionManager.getConnection();
            System.out.println("Connection is " + con);
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Table table = new Table();
                table.setRestaurantId(rs.getInt("restaurantId"));
                table.setCapacity(rs.getInt("capacity"));
                table.setAvalability(rs.getInt("avalability"));
                tableList.add(table);
            }
            return tableList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
    
    
    public Table fetchTableDetails(Integer restaurantId) throws SQLException, Exception {
        ResultSet rs = null;
        Connection con = null;
        Table table = new Table();
        try {
            con = ConnectionManager.getConnection();
            String sql = "SELECT restaurantId,  capacity, "
                    + "avalability FROM tables WHERE restaurantId=?";
            PreparedStatement ps = con.prepareStatement(sql);
            System.out.println("restaurantId = " + restaurantId);
            ps.setInt(1, restaurantId);
            System.out.println("Select SQL = " + ps);

            rs = ps.executeQuery();
            if (rs.next()) {
                table.setRestaurantId(rs.getInt("restaurantId"));
                table.setCapacity(rs.getInt("capacity"));
                table.setAvalability(rs.getInt("avalability"));
             

            }
            return table;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public int updateTableDetails(Integer restaurantId, Integer capacity, Integer avalability 
            ) throws SQLException, Exception {

        Connection con = ConnectionManager.getConnection();
        int i = 0;
        try {
            String sql = "UPDATE tables SET capacity = ?, "
                    + " avalability = ?"
                    + "WHERE restaurantId = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, restaurantId);
            ps.setInt(2, capacity);
            ps.setInt(3, avalability);
           
          
            System.out.println("Select SQL = " + ps);
            i = ps.executeUpdate();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public int deleteTableDetails(Integer restaurantId) throws SQLException, Exception {
        Connection con = ConnectionManager.getConnection();
        int i = 0;
        try {
            String sql = "UPDATE tables SET status = 0 WHERE restaurantId = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, restaurantId);
            i = ps.executeUpdate();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public Table validateLoginCredentials(Integer restaurantId) throws SQLException {
        ResultSet rs = null;
        Connection con = null;
        Table table = null;
        try {

            con = ConnectionManager.getConnection();
            String sql = "SELECT * FROM tables WHERE restaurantId= ? AND status= 1;";
            PreparedStatement ps = con.prepareStatement(sql);
            System.out.println("restaurantId = " + restaurantId);
            ps.setInt(1, restaurantId);
          
            System.out.println("Select SQL = " + ps);

            rs = ps.executeQuery();

            if (rs.next()) {
                table = new Table();
                table.setRestaurantId(rs.getInt("restaurantId"));
                table.setCapacity(rs.getInt("capacity"));
                table.setAvalability(rs.getInt("avalability"));
               
                table.setStatus(true);
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (con != null) {
                con.close();
            }
        }
        return table;
    }

}
