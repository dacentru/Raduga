/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package om.okna.raduga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import static om.okna.raduga.MainFrame.MainTable;

/**
 *
 * @author Виктор
 */
public class WriteDataSQL {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://192.168.137.1/GPR";

    static final String USER = "GPR";
    static final String PASS = "repinboss12345";

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    public WriteDataSQL(String[] data) {
        String sql = "UPDATE `gpr`.`gpr` SET `dogovor` = '"+data[1]+"', `two` = '"+data[2]+"', `three` = '"+data[3]+"' WHERE `gpr`.`id` = "+data[0];
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(sql);
            
            System.out.println(data[0]);
            System.out.println(data[1]);
            System.out.println(data[2]);
            System.out.println(data[3]);
            
            resultSet.close();
            statement.close();
            connect.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (connect != null) {
                    connect.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
