import java.util.*;
import java.text.*;
public class DateTimeTest1
{
 public static void main(String argv[])
 {
  Date date=new Date();
  DateFormat df=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,Locale.TAIWAN);
  System.out.println(df.format(date));
 }
}