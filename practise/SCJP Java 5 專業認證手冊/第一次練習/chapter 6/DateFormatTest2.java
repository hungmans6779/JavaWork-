import java.util.*;
import java.text.*;
public class DateFormatTest2
{
 public static void main(String argv[])
 {
  Date now=new Date(System.currentTimeMillis());
  DateFormat d=DateFormat.getDateInstance(DateFormat.FULL);
  System.out.println("�{�b���ɶ��� :"+d.format(now));
 }
}