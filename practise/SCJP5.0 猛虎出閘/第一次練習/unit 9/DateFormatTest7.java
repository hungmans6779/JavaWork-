import java.util.*;
import java.text.*;
public class DateFormatTest7
{
 public static void main(String argv[])
 {
  Date date=null;
  String ds="���ѬO:2006�~09��05�� �P���G";
  DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,Locale.TAIWAN);
  date=df.parse(ds,new ParsePosition(4));
  System.out.println(date);
  System.out.println(df.format(date));
 }
}