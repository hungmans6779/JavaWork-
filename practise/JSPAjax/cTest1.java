import java.sql.*;
public class cTest1{
  public static void main(String argv[]){
  
    try{    
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Connection con=DriverManager.getConnection("jdbc:odbc:JSPAjax");
      Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery("select * from password2");      
      while(rs.next()){
         System.out.println(rs.getString("userid").trim()+" = > "+rs.getString("passwd").trim());
       
      }	
      
    }catch(Exception e){
    	System.out.println(e.getMessage());
    }	  
    	
  }
}