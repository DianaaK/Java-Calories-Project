package java_contact_app;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class myConnection {
  public static Connection getConnection()
  {
      Connection con=null;
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:1433/EAP?user=admin&password=admin&useUnicode=true&characterEncoding=UTF-8");
          
      } catch(ClassNotFoundException | SQLException ex){
          System.out.println(ex.getMessage());
          
      }
      return con;
  }
}
