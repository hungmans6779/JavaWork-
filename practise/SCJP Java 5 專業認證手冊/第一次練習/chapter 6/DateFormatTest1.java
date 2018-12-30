import java.text.*;
import java.util.*;
public class DateFormatTest1
{
 public static void main(String argv[])
 {
  Date now=new Date(System.currentTimeMillis());
  System.out.println("現在的時間為 : "+now);
  DateFormat df[]=new DateFormat[6];
  df[0]=DateFormat.getInstance();
  df[1]=DateFormat.getDateInstance();
  df[2]=DateFormat.getDateInstance(DateFormat.SHORT);
  df[3]=DateFormat.getDateInstance(DateFormat.LONG);
  df[4]=DateFormat.getDateInstance(DateFormat.MEDIUM);
  df[5]=DateFormat.getDateInstance(DateFormat.FULL);
  for(DateFormat d:df)
  {
   System.out.println(d.format(now));	
  }	
 }
}