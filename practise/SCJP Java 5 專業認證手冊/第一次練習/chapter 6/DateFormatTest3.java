import java.util.*;
import java.text.*;
public class DateFormatTest3
{
 public static void main(String argv[])
 {
  Date now=new Date(System.currentTimeMillis());
  System.out.println("�{�b���ɶ��O : "+now);
  //DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
  //DateFormat df=DateFormat.getDateInstance(DateFormat.LONG);
  //DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM);
  DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
  String str=df.format(now);
  System.out.println("�榡�ƹL�᪺�ɶ��O : "+str);
  try
  {
   Date dnow=df.parse(str);
   System.out.println("parse�L�᪺�ɶ��� : "+dnow);	
  }
  catch(ParseException pe)
  {
   pe.printStackTrace();
   System.out.println(pe.getMessage());
   System.out.println(pe.getLocalizedMessage());	
  }		
 }
}