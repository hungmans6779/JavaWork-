import java.util.*;
import java.text.*;
public class DateFormatTest5
{
 public static void main(String argv[])
 {
  Date date=null;
  String d="2005¦~05¤ë05¤é";
  DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,Locale.TAIWAN);
  try
  {
   date=df.parse(d);
  }
  catch(ParseException pe)
  {
   pe.printStackTrace();
  }
  System.out.println(date);
  System.out.println(df.format(date));
 }
}