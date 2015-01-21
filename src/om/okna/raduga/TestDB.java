/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package om.okna.raduga;

import java.sql.*;
/**
 *
 * @author Виктор
 */
public class TestDB {
    // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://192.168.137.1/GPR";

   //  Database credentials
   static final String USER = "GPR";
   static final String PASS = "repinboss12345";
   
   public TestDB() {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Подключкение к базе данных...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query
      System.out.println("Проверка состояния...");
      stmt = conn.createStatement();
      String sql;
      sql = "SELECT id, one, two, three FROM gpr";
      if (stmt.execute(sql)) System.out.println("Подключились...");
      ResultSet rs = stmt.executeQuery(sql);

      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("id");
         String age = rs.getString("one");
         String first = rs.getString("two");
         String last = rs.getString("three");

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", One: " + age);
         System.out.print(", Two: " + first);
         System.out.println(", Three: " + last);
      }
      //STEP 6: Clean-up environment
      rs.close();
      stmt.close();
      conn.close();
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Работает епт)))!");
}
}
