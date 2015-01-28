package om.okna.raduga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static om.okna.raduga.ReedArraySQL.DB_URL;
import static om.okna.raduga.ReedArraySQL.JDBC_DRIVER;
import static om.okna.raduga.ReedArraySQL.PASS;
import static om.okna.raduga.ReedArraySQL.USER;

public class WriteDataSQL {

    private Connection connect = null;
    private PreparedStatement preparedStatement = null;
    
    public WriteDataSQL(String[] data) {
        String sql = "UPDATE registry SET "
                + "client=?,"
                + "object=?,"
                + "contract=?,"
                + "nomination=?,"
                + "size=?,"
                + "contact_inside=?,"
                + "contact_outside=?,"
                + "date_start=?,"
                + "date_end=?,"
                + "date_confirmation=?,"
                + "price=?,"
                + "note=?,"
                + "payment=?,"
                + "debt=?"
                + " WHERE id =?";
        try {
            Class.forName(JDBC_DRIVER);
            connect = DriverManager.getConnection(DB_URL, USER, PASS);
            preparedStatement = connect.prepareStatement(sql);
            
            preparedStatement.setString(1, data[1]);
            preparedStatement.setString(2, data[2]);
            preparedStatement.setString(3, data[3]);
            preparedStatement.setString(4, data[4]);
            preparedStatement.setString(5, data[5]);
            preparedStatement.setString(6, data[6]);
            preparedStatement.setString(7, data[7]);
            preparedStatement.setString(8, data[8]);
            preparedStatement.setString(9, data[9]);
            preparedStatement.setString(10, data[10]);
            preparedStatement.setString(11, data[11]);
            preparedStatement.setString(12, data[12]);
            preparedStatement.setString(13, data[13]);
            preparedStatement.setString(14, data[14]);
            preparedStatement.setString(15, data[0]);
            
            preparedStatement.executeUpdate();
            connect.close();
        } catch (SQLException se) {
            LogerFrame.out(se);
            se.printStackTrace();
        } catch (Exception e) {
            LogerFrame.out(e);
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
                LogerFrame.out(se);
                se.printStackTrace();
            }
        }
    }
}
