import java.util.Date;
public class Test10
{
 public static void main(String argv[])
 {
  Date d=getDate();
  System.out.println("d="+d);
 }
 public static Date getDate()
 {
 	Date d2=new Date();
 	StringBuffer now=new StringBuffer(d2.toString());
 	System.out.println(now);
 	return d2;
 }	
}