import java.util.*;
import java.text.*;
public class DateFormatTest2
{
 public static void main(String argv[])
 {
  Date now=new Date(System.currentTimeMillis());
  DateFormat d=DateFormat.getDateInstance(DateFormat.FULL);
  System.out.println("現在的時間為 :"+d.format(now));
 }
}