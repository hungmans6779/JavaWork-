import java.util.*;
public class DateTest3
{
 public static void main(String argv[])
 {
  //long time=System.currentTimeMillis();
  Date now=new Date(System.currentTimeMillis());
  System.out.println("�{�b���ɶ��� : "+now);
  
  
  Calendar c=Calendar.getInstance();
  Date now1=c.getTime();
  System.out.println("�{�b���ɶ��� : "+now1);
 }
}