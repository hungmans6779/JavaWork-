import java.util.*;
import java.text.*;
public class DateFormatTest3
{
 public static void main(String argv[])
 {
  Date date=null;
  String str="2007年4月8日";
  DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,Locale.TAIWAN);
  try
  {
   date=df.parse(str);	
  }	
  catch(ParseException pe)
  {
   pe.printStackTrace();	
  }	
  finally
  {
   System.out.println("謝謝使用本程式");	
  }
  System.out.println(date);
  System.out.println(df.format(date));	
 }
}