import com.sun.org.apache.xerces.internal.impl.dv.xs.YearDV;
import java.sql.*;

public class DBTest1 {
    
    /** Creates a new instance of DBTest1 */
    public DBTest1() {
    }
    public static void main(String[] args){
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection cn = DriverManager.getConnection("jdbc:odbc:MyAccess");
            Statement smt = cn.createStatement();
            ResultSet rst =  smt.executeQuery("Select * from SCORE");
            
            while(rst.next()){
                System.out.printf("STUDNO: %s%n",rst.getString("STUDNO"));
            }
            
            rst = null;
            smt = null;
            cn = null;
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
