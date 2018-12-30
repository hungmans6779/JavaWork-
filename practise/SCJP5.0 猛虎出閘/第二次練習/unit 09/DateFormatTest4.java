import java.util.Date;
import java.util.Locale;
import java.text.*;
public class DateFormatTest4
{
 public static void main(String argv[])
 {
  String str="今天是:2007年4月8日 星期五";
  DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,Locale.TAIWAN);
  Date date=df.parse(str,new ParsePosition(4));
  System.out.println(date);
  System.out.println(df.format(date));
 }
}