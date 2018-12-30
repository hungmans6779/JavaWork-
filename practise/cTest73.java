import java.sql.*;
public class cTest73
{
 public static void main(String argv[])
 {
  try
  {
   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   Connection dbCon=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BusDB;user=sa;password=123");	
   Statement stmt=dbCon.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
   ResultSet rs=stmt.executeQuery("select * from Bouns");
   ResultSetMetaData rsmd=rs.getMetaData();
   for(int i=1;i<=rsmd.getColumnCount();System.out.print(rsmd.getColumnLabel(i)+"\t"),i++);
   while(rs.next())
   {
   	 for(int i=1;i<=rsmd.getColumnCount();System.out.print(rs.getString(i)+"\t"),i++);
   	 System.out.println();
   }	   	
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }		
 }
}