import java.sql.*;
public class cTest72
{
 public static void main(String argv[])
 {
 	try
 	{
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   Connection dbCon=DriverManager.getConnection("jdbc:odbc:AllData_db");
   Statement stmt=dbCon.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
   ResultSet rs=stmt.executeQuery("select * from eatMenu");
   while(rs.next())
   {
    System.out.println(rs.getString(1));	
   }	
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }	 
 } 
}