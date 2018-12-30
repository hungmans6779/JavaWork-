import java.sql.*;
public class DataBase1 {
    
    public DataBase1() {
    }
    
    public static void main(String argv[]) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection dbCon=DriverManager.getConnection("jdbc:odbc:Access_MyDB");
            Statement stmt=dbCon.createStatement();
            ResultSet rs=stmt.executeQuery("select * from student");
            ResultSetMetaData rsmd=rs.getMetaData();
            int totalCol=rsmd.getColumnCount();
            
            while(rs.next()) {
                for(int i=1;i<=totalCol;i++) {
                    System.out.print(rs.getString(i)+",");
                    //System.out.print(rs.getString(rsmd.getColumnName(i))+",");
                }
                System.out.println();
            }
            rs.close();
            stmt.close();
            dbCon.close();
        } catch(Exception s) {
            s.printStackTrace();
        }
    }
    
}
