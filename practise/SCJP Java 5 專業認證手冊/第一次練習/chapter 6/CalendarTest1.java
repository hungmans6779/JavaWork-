import java.util.*;
public class CalendarTest1
{
 public static void main(String argv[])
 {	
  //Calendar c=new Calendar();
  Calendar c=Calendar.getInstance();
  Date d=c.getTime();
  System.out.println(d);
  System.out.println(d.toString());
 } 
}