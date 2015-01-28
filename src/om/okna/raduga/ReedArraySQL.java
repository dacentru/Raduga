/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package om.okna.raduga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import static om.okna.raduga.MainFrame.MainTable;

/**
 *
 * @author Виктор
 */
public class ReedArraySQL {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://192.168.137.1/raduga";

    static final String USER = "raduga";
    static final String PASS = "12345678";

    public ReedArraySQL() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT "
                    + "id,"
                    + "client,"
                    + "object,"
                    + "contract,"
                    + "nomination,"
                    + "size,"
                    + "contact_inside,"
                    + "contact_outside,"
                    + "date_start,"
                    + "date_end,"
                    + "date_confirmation,"
                    + "price, note,"
                    + "payment,"
                    + "debt"
                    + " FROM registry";

            try (ResultSet rs = stmt.executeQuery(sql)) {
                DefaultTableModel model = (DefaultTableModel) MainTable.getModel();
                while (rs.next()){
                    model.addRow(new Object[] {
                        rs.getInt("id"),
                        rs.getString("client"),
                        rs.getString("object"),
                        rs.getString("contract"),
                        rs.getString("nomination"),
                        rs.getString("size"),
                        rs.getString("contact_inside"),
                        rs.getString("contact_outside"),
                        rs.getString("date_start"),
                        rs.getString("date_end"),
                        rs.getString("date_confirmation"),
                        rs.getString("price"),
                        rs.getString("note"),
                        rs.getString("payment"),
                        rs.getString("debt")
                    });
//                    LogerFrame.out(rs.getInt("id"));
//                    LogerFrame.out(rs.getString("client"));
//                    LogerFrame.out(rs.getString("object"));
//                    LogerFrame.out(rs.getString("contract"));
//                    LogerFrame.out(rs.getString("nomination"));
//                    LogerFrame.out(rs.getString("size"));
//                    LogerFrame.out(rs.getString("contact_inside"));
//                    LogerFrame.out(rs.getString("contact_outside"));
//                    LogerFrame.out(rs.getString("date_start"));
//                    LogerFrame.out(rs.getString("date_end"));
//                    LogerFrame.out(rs.getString("date_confirmation"));
//                    LogerFrame.out(rs.getString("price"));
//                    LogerFrame.out(rs.getString("note"));
//                    LogerFrame.out(rs.getString("payment"));
//                    LogerFrame.out(rs.getString("debt"));
                }
            }
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
