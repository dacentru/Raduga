package om.okna.raduga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static om.okna.raduga.Main.customersTable;
import static om.okna.raduga.Options.DB_URL;
import static om.okna.raduga.Options.JDBC_DRIVER;
import static om.okna.raduga.Options.PASS;
import static om.okna.raduga.Options.USER;
import static om.okna.raduga.Options.debugMode;

/**
 *
 * @author Виктор
 */
public class SQLHandler {
    
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private static PreparedStatement ps;
    
    static boolean accessSQL=true;
    
    public SQLHandler(){
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(accessSQL){
            //refreshTable(customersTable);
        }else{
            if(debugMode)Loger.out("Все накрылось к хуям, база данных неработает");
        }
        //DriverManager.setLogStream(System.out); 
    }
    
    public void readArraySQL() {
        DefaultTableModel model = (DefaultTableModel) customersTable.getModel();
        String query = "SELECT "
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
        try {
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                model.addRow(new Object[]{
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
            }
        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{con.close();}catch(SQLException se){se.printStackTrace();}
            try{stmt.close();}catch(SQLException se){se.printStackTrace();}
            try{rs.close();}catch(SQLException se){se.printStackTrace();}
        }
    }
    
    void newClient(String[] data){
        System.out.println(Arrays.toString(data));
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
                con = DriverManager.getConnection(DB_URL,USER,PASS);
                ps = con.prepareStatement(query);
                
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
        }catch(SQLException se){
            se.printStackTrace();
        }finally{
            try{con.close();}catch(SQLException se){se.printStackTrace();}
            try{stmt.close();}catch(SQLException se){se.printStackTrace();}
            try{ps.close();}catch(SQLException se){se.printStackTrace();}
        }
    }
    
    void updateData(String[] data){
        String query="update registry set "
                +"client=?,"
                +"object=?,"
                +"contract=?,"
                +"nomination=?,"
                +"size=?,"
                +"contact_inside=?,"
                +"contact_outside=?,"
                +"date_start=?,"
                +"date_end=?,"
                +"date_confirmation=?,"
                +"price=?,"
                +"note=?,"
                +"payment=?,"
                +"debt=? where id =?";
        try {
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            ps = con.prepareStatement(query);

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
        }catch(SQLException se){
            se.printStackTrace();
        }finally{
            try{con.close();}catch(SQLException se){se.printStackTrace();}
            try{stmt.close();}catch(SQLException se){se.printStackTrace();}
            try{ps.close();}catch(SQLException se){se.printStackTrace();}
        }
    }
    
    void removeData(int id){
        String query = "DELETE FROM registry WHERE id =?";
        try{
            //Class.forName(JDBC_DRIVER);
            con=DriverManager.getConnection(DB_URL,USER,PASS);
            ps=con.prepareStatement(query);

            ps.setInt(1, id);

            ps.executeUpdate();
        }catch(SQLException se){
            se.printStackTrace();
        }finally{
            try{con.close();}catch(SQLException se){se.printStackTrace();}
            try{stmt.close();}catch(SQLException se){se.printStackTrace();}
            try{ps.close();}catch(SQLException se){se.printStackTrace();}
        }
    }

    String userLogin(String user) {
        String query = "select password from raduga.users where username='"+user+"'";
        String result = null;
        try{
            con=DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=con.createStatement();
            rs=stmt.executeQuery(query);
            while(rs.next()){
                result = rs.getString(1);
            }
            System.out.println(result);
            stmt.close();
            con.close();
        }catch(SQLException se){
            se.printStackTrace();
        }finally{
            try{con.close();}catch(SQLException se){se.printStackTrace();}
            try{stmt.close();}catch(SQLException se){se.printStackTrace();}
            try{rs.close();}catch(SQLException se){se.printStackTrace();}
        }
        return result;
    }

    static int selectSecurityFromUsersWhereUsername(String user) {
        String query = "select security from users where username='"+user+"'";
        int result = 0;
        try {
            //Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                result = rs.getInt(1);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return result;
    }

    void addUser(String[] data) {
        String query = "INSERT INTO users "
                + "(username,"
                + "password,"
                + "email,"
                + "first_name,"
                + "last_name,"
                + "patronymic_name,"
                + "security) values (?,?,?,?,?,?,?)";
        try{
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            ps = con.prepareStatement(query);
            
            ps.setString(1, data[1]);
            ps.setString(2, data[2]);
            ps.setString(3, data[3]);
            ps.setString(4, data[4]);
            ps.setString(5, data[5]);
            ps.setString(6, data[6]);
            ps.setString(7, data[7]);
            
            ps.execute();
        }catch(SQLException se){
            se.printStackTrace();
        }finally{
            try{con.close();}catch(SQLException se){se.printStackTrace();}
            try{stmt.close();}catch(SQLException se){se.printStackTrace();}
            try{ps.close();}catch(SQLException se){se.printStackTrace();}
        }
    }

    String[] getUserData(int id) {
        String query = "select * from raduga.users where id="+id;
        String[] data = new String[9];
        try {
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
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
            if(debugMode)Loger.out(data);
        } catch (SQLException se) {
            se.printStackTrace();
        }finally{
            try{con.close();}catch(SQLException se){se.printStackTrace();}
            try{stmt.close();}catch(SQLException se){se.printStackTrace();}
            try{rs.close();}catch(SQLException se){se.printStackTrace();}
        }
        return data;
    }

    void updateUser(String[] data) {
        Loger.out("Обновление информации в базе: "+Arrays.toString(data));
        Loger.errout("НЕ РАБОТАЕТ");
        throw new UnsupportedOperationException("НЕ РАБОТАЕТ"); //To change body of generated methods, choose Tools | Templates.
    }
    
    static int getYArrayLenght(String query){
        int result=0;
        try{
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while(rs.next()){
                result++;
            }
        }catch(SQLException se) {
            se.printStackTrace();
        }finally{
            try{con.close();}catch(SQLException se){se.printStackTrace();}
            try{stmt.close();}catch(SQLException se){se.printStackTrace();}
            try{rs.close();}catch(SQLException se){se.printStackTrace();}
        }
        return result;
    }

    private int getXArrayLenght(String query){
        int result=0;
        try{
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while(rs.next()){
                result++;
            }
        }catch(SQLException se) {
            se.printStackTrace();
        }finally{
            try{con.close();}catch(SQLException se){se.printStackTrace();}
            try{stmt.close();}catch(SQLException se){se.printStackTrace();}
            try{rs.close();}catch(SQLException se){se.printStackTrace();}
        }
        return result;
    }
    
    static String[][] selectDataFromTable(String[] data,String table) {
        int x;
        int y=0;
        String datas=data[0];
        for (x=1; x<data.length;x++) {
            datas+=", "+data[x];
        }
        String query = "SELECT "+datas+" FROM "+table;
        String[][] result=new String[getYArrayLenght(query)][data.length];
        try {
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if(debugMode)Loger.out("Отправлен запрос: "+query);
            while (rs.next()) {
                for(x=0;x<data.length;x++){
                    //if(debugMode)Loger.out("Строка: "+y+" ячейка: "+x+" "+rs.getString(data[x]));
                    result[y][x]=rs.getString(data[x]);
                }
                y++;
            }
        }catch(SQLException se){se.printStackTrace();}
        finally{
            try{
                con.close();
                stmt.close();
                rs.close();
            }catch(SQLException se){se.printStackTrace();}
        }
        return result;
    }
    
    String[] selectAllFromTableWhereId(String table,int id) {
        String query = "select * from "+table+" where id="+id;
        String[] result=new String[getXArrayLenght(query)];//хуй получим, нужно думать
        if(debugMode)Loger.out(result.length);
        try {
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                for(int i=0,q=1;i<result.length;i++,q++){
                    result[i]=rs.getString(q);
                }
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }finally{
            try{con.close();}catch(SQLException se){se.printStackTrace();}
            try{stmt.close();}catch(SQLException se){se.printStackTrace();}
            try{rs.close();}catch(SQLException se){se.printStackTrace();}
        }
        return result;
    }
}
