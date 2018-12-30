import java.util.*;
import java.text.*;
public class DateFormatTest6
{
 public static void main(String argv[])
 {
  Date date=null;
  DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,Locale.TAIWAN);
  try
  {
   date=df.parse("2006¦~09¤ë05¤é");
  }
  catch(ParseException pe)
  {
   pe.printStackTrace();
  }
  System.out.println(date);
  System.out.println(df.format(date));
 }
}