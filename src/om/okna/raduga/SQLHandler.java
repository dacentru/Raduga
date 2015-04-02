package om.okna.raduga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
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
            con.close();
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
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
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
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            LogerFrame.out(e);
        }
    }
    
    void removeData(int id){
        String query = "delete from registry where id =?";
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            ps.executeUpdate();
            con.close();
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
}
