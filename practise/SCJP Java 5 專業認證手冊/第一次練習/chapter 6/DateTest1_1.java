import java.util.*;
class DateTest1_1
{
 public static void main(String argv[])
 {
  Date d1=new Date(1000000000000L);
  System.out.println(d1.toString());
  d1.setTime(d1.getTime()+3600000);
  System.out.println(d1.toString());
 }
}