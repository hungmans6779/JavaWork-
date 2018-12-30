import java.util.Date;
public class GCTest2
{
 public static void main(String argv[])
 {
  Date d=getDate();
  System.out.println(d);
 }
 static Date getDate()
 {
  Date d2=new Date();
  StringBuffer now=new StringBuffer(d2.toString());
  System.out.println("now = "+now);
  return d2;
 }
 
}