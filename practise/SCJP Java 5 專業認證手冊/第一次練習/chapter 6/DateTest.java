import java.util.*;
public class DateTest
{
 public static void main(String argv[])
 {
  Date d=new Date();
  String str=d.toString();
  System.out.println("現在的時間為 : "+str);
  
  Date now=new Date(System.currentTimeMillis());
  System.out.println("現在的時間為 : "+now);
 }
}