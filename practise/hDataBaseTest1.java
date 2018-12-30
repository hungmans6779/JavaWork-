import java.sql.*;
public class hDataBaseTest1
{
 public static void main(String argv[])
 {
  
  try
  {
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   Connection dbCon=DriverManager.getConnection("jdbc:odbc:SQL_MyDB");
   Statement stmt=dbCon.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
   ResultSet rs=stmt.executeQuery("select * from student");
   ResultSetMetaData rsmd=rs.getMetaData();
   
   for(int i=1;i<=rsmd.getColumnCount();i++)
   {
    System.out.println(rsmd.getColumnClassName(i));	
   }	
  }
  catch(Exception e)
  {
   System.out.println("發生例外的原因是："+e.getMessage());	
  }			
 	
 }		
}	