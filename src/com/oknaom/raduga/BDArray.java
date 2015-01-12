/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oknaom.raduga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import static com.oknaom.raduga.MainFrame.jTable1;

/**
 *
 * @author Виктор
 */
public class BDArray {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://192.168.137.1/GPR";

    static final String USER = "GPR";
    static final String PASS = "repinboss12345";

    public BDArray() {
        Connection conn = null;
        Statement stmt = null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");

            
           
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            
            
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, one, two, three FROM gpr";

            ResultSet rs = stmt.executeQuery(sql);

            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            
            while (rs.next()) {
                
//                int id = rs.getInt("id");
//                String age = rs.getString("one");
//                String first = rs.getString("two");
//                String last = rs.getString("three");
                
                
                model.addRow(new Object[] {rs.getInt("id"), rs.getString("one"), rs.getString("two"), rs.getString("three")});
            }
            
            
            
            
            
            
            
            
            
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
