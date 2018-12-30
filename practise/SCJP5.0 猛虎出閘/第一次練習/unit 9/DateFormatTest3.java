import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
public class DateFormatTest3
{
 public static void main(String argv[])
 {
  Date date=new Date();
  DateFormat df=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,Locale.TAIWAN);
  System.out.println(df.format(date));
 }
}