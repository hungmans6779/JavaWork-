import java.util.*;
public class CalendarTest
{
 public static void main(String argv[])
 {
  Calendar c=Calendar.getInstance();
  Date now=c.getTime();
  System.out.println("�{�b���ɶ��� : "+now);
   
  Locale loctw=new Locale("zh","tw");
  Calendar c1=Calendar.getInstance(loctw);
  Date now1=c1.getTime();
  System.out.println("�{�b���ɶ��� : "+now1); 
  
 }
}