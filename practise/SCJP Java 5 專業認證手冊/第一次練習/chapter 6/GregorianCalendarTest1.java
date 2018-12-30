import java.util.*;
public class GregorianCalendarTest1
{
 public static void main(String argv[])
 {
  GregorianCalendar gc=new GregorianCalendar();
  String str=gc.get(GregorianCalendar.HOUR)+":"+
 	       gc.get(GregorianCalendar.MINUTE)+":"+
 	       gc.get(GregorianCalendar.SECOND);
  System.out.println("現在的時間為 : "+str); 	       
 }
}
 
