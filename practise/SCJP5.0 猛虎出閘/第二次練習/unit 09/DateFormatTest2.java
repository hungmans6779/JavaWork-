import java.util.*;
import java.text.*;
public class DateFormatTest2
{
 public static void main(String argv[])
 {
 	Date date=new Date();
  DateFormat df=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT,Locale.TAIWAN);
  System.out.println(df.format(date));
 }
}