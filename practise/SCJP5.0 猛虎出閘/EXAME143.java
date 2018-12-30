import java.util.*;
import java.text.*;
public class EXAME143
{
 public static void main(String argv[])
 {
  Date d=new Date(0L);
  DateFormat df=DateFormat.getDateInstance();
  String ds="December 15,2004";
  try
  {
   d=df.parse(ds);	
   System.out.println(d);
  }	
  catch(ParseException pe)
  {
   System.out.println("有例外產生了");
  }	
 }
}