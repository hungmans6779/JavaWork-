import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
public class DateFormatTest1
{
 private static Date date=new Date();
 public static void main(String aragv[])
 {
  show(DateFormat.SHORT,DateFormat.SHORT,Locale.TAIWAN);
  show(DateFormat.MEDIUM,DateFormat.MEDIUM,Locale.TAIWAN);
  show(DateFormat.LONG,DateFormat.LONG,Locale.TAIWAN);
  show(DateFormat.FULL,DateFormat.FULL,Locale.TAIWAN);
 }
 private static void show(int dateFormat,int timeFormat,Locale locale)
 {
  DateFormat df=DateFormat.getDateTimeInstance(dateFormat,timeFormat,locale);
  System.out.println(df.format(date));
 
 }


}