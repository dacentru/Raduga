package om.okna.raduga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import static om.okna.raduga.ChoiseFrame.userListTable;

public class SQLHandler {
    
    static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://192.168.137.1/raduga";

    static String USER = "raduga";
    static String PASS = "12345678";
    
    void newClient(String[] data){
        String query = "insert into registry "
                + "(client,"
                + "object,"
                + "contract,"
                + "nomination,"
                + "size,"
                + "contact_inside,"
                + "contact_outside,"
                + "date_start,"
                + "date_end,"
                + "date_confirmation,"
                + "price,"
                + "note,"
                + "payment,"
                + "debt) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            Class.forName(JDBC_DRIVER);
            try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS)) {
                PreparedStatement ps = con.prepareStatement(query);
                
                ps.setString(1, data[1]);
                ps.setString(2, data[2]);
                ps.setString(3, data[3]);
                ps.setString(4, data[4]);
                ps.setString(5, data[5]);
                ps.setString(6, data[6]);
                ps.setString(7, data[7]);
                ps.setString(8, data[8]);
                ps.setString(9, data[9]);
                ps.setString(10, data[10]);
                ps.setString(11, data[11]);
                ps.setString(12, data[12]);
                ps.setString(13, data[13]);
                ps.setString(14, data[14]);
                
                ps.execute();
            }
        }catch(ClassNotFoundException | SQLException e){
            LogerFrame.out(e);
        }
    }
    
    void updateData(String[] data){
        String query = "update registry set "
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
                + "debt=? where id =?";
        try {
            Class.forName(JDBC_DRIVER);
            try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS)) {
                PreparedStatement ps = con.prepareStatement(query);
                
                ps.setString(1, data[1]);
                ps.setString(2, data[2]);
                ps.setString(3, data[3]);
                ps.setString(4, data[4]);
                ps.setString(5, data[5]);
                ps.setString(6, data[6]);
                ps.setString(7, data[7]);
                ps.setString(8, data[8]);
                ps.setString(9, data[9]);
                ps.setString(10, data[10]);
                ps.setString(11, data[11]);
                ps.setString(12, data[12]);
                ps.setString(13, data[13]);
                ps.setString(14, data[14]);
                ps.setString(15, data[0]);
                
                ps.executeUpdate();
            }
        }catch(ClassNotFoundException | SQLException e){
            LogerFrame.out(e);
        }
    }
    
    void removeData(int id){
        String query = "delete from registry where id =?";
        try {
            Class.forName(JDBC_DRIVER);
            try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS)) {
                PreparedStatement ps = con.prepareStatement(query);
                
                ps.setInt(1, id);
                
                ps.executeUpdate();
            }
        } catch (ClassNotFoundException | SQLException e) {
            LogerFrame.out(e);
        }
    }

    String userLogin(String user) {
        String query = "select password from raduga.users where username='"+user+"'";
        String res = null;
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                res = rs.getString(1);
            }
            st.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            LogerFrame.out(e);
        }
        return res;
    }

    int userAccess(String user) {
        String query = "select security from users where username='"+user+"'";
        int res = 0;
        try {
            Class.forName(JDBC_DRIVER);
            try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS); Statement st = con.createStatement()) {
                ResultSet rs = st.executeQuery(query);
                while(rs.next()){
                    res = rs.getInt(1);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            LogerFrame.out(e);
        }
        return res;
    }

    void addUser(String[] data) {
        String query = "insert into users "
                + "(username,"
                + "password,"
                + "email,"
                + "first_name,"
                + "last_name,"
                + "patronymic_name,"
                + "security) values (?,?,?,?,?,?,?)";
        try{
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, data[1]);
            ps.setString(2, data[2]);
            ps.setString(3, data[3]);
            ps.setString(4, data[4]);
            ps.setString(5, data[5]);
            ps.setString(6, data[6]);
            ps.setString(7, data[7]);
            
            ps.execute();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            LogerFrame.out(e);
        }
    }

    String[] getUserData(int id) {
        String query = "select * from raduga.users where id='"+id+"'";
        String[] data = new String[9];
        try {
            Class.forName(JDBC_DRIVER);
            try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS); Statement st = con.createStatement()) {
                ResultSet rs = st.executeQuery(query);
                while(rs.next()){
                    data[0] = rs.getString(1);
                    data[1] = rs.getString(2);
                    data[2] = rs.getString(3);
                    data[3] = rs.getString(4);
                    data[4] = rs.getString(5);
                    data[5] = rs.getString(6);
                    data[6] = rs.getString(7);
                    data[7] = rs.getString(8);
                    data[8] = rs.getString(9);
                }
                LogerFrame.out(data);
            }
        } catch (ClassNotFoundException | SQLException e) {
            LogerFrame.errout(e);
        }
        return data;
    }

    void updateUser(String[] data) {
        LogerFrame.out("Обновление информации в базе: "+Arrays.toString(data));
        LogerFrame.errout("НЕ РАБОТАЕТ");
        throw new UnsupportedOperationException("НЕ РАБОТАЕТ"); //To change body of generated methods, choose Tools | Templates.
    }

    void getUserList() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT id, username FROM users";

            try (ResultSet rs = stmt.executeQuery(sql)) {
                DefaultTableModel model = (DefaultTableModel) userListTable.getModel();
                while (rs.next()){
                    model.addRow(new Object[] {
                        rs.getInt("id"),
                        rs.getString("username")
                    });
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
