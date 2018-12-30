package javaBean;
import java.util.Hashtable;
public class DBUtil
{
 private Hashtable  user=new Hashtable (); 
 private static DBUtil dd=new DBUtil();
 public DBUtil()
 {
  UserBean u1=new UserBean();
  u1.setName("賽亞人");
  u1.setPassword("12345");
  u1.setEmail("hungmans@yahoo.com.tw");
  user.put("u1",u1);
  
  UserBean u2=new UserBean();
  u2.setName("自由人");
  u2.setPassword("77777");
  u2.setEmail("h1@hinet.net");
  user.put("u2",u2);
 }	
 
 public static  DBUtil getInstance()
 { return dd; }
 
 public UserBean getUser(String name)
 {
  UserBean use=(UserBean)user.get(name);
  return use;
 }
 
}