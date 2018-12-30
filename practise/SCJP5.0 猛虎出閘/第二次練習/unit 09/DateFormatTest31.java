import java.util.*;
import java.text.*;
public class DateFormatTest31
{
 public static void main(String argv[])
 {
  Date date=null;
  String str="2007/4/8";
  DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT,Locale.TAIWAN);
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
   System.out.println("���¨ϥΥ��{��");	
  }
  System.out.println(date);
  System.out.println(df.format(date));	
 }
}