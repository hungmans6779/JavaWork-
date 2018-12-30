import java.util.*;
public class DateTest3
{
 public static void main(String argv[])
 {
  //long time=System.currentTimeMillis();
  Date now=new Date(System.currentTimeMillis());
  System.out.println("現在的時間為 : "+now);
  
  
  Calendar c=Calendar.getInstance();
  Date now1=c.getTime();
  System.out.println("現在的時間為 : "+now1);
 }
}