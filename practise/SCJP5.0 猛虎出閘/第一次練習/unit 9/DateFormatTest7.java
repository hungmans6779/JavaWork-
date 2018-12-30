import java.util.*;
import java.text.*;
public class DateFormatTest7
{
 public static void main(String argv[])
 {
  Date date=null;
  String ds="今天是:2006年09月05日 星期二";
  DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,Locale.TAIWAN);
  date=df.parse(ds,new ParsePosition(4));
  System.out.println(date);
  System.out.println(df.format(date));
 }
}