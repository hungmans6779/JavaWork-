import java.util.*;
import java.text.*;
public class DateFormatTest3
{
 public static void main(String argv[])
 {
  Date now=new Date(System.currentTimeMillis());
  System.out.println("現在的時間是 : "+now);
  //DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
  //DateFormat df=DateFormat.getDateInstance(DateFormat.LONG);
  //DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM);
  DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
  String str=df.format(now);
  System.out.println("格式化過後的時間是 : "+str);
  try
  {
   Date dnow=df.parse(str);
   System.out.println("parse過後的時間為 : "+dnow);	
  }
  catch(ParseException pe)
  {
   pe.printStackTrace();
   System.out.println(pe.getMessage());
   System.out.println(pe.getLocalizedMessage());	
  }		
 }
}