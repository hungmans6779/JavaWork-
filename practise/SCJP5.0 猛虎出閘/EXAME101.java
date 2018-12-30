import java.util.*;
import java.text.*;
public class EXAME101
{
 public static void main(String argv[])
 {
  Date d=new Date(0);
  String ds="December 15,2004";
  //DateFormat df=DateFormat.getDateInstance();
  DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,Locale.US);
  try
  {
   d=df.parse(ds);	
  }	
  catch(ParseException e)
  {
   System.out.println("Unable to parse "+ds);	
  }
  d.setTime((1000*60*60*24)+d.getTime());	
 }
}