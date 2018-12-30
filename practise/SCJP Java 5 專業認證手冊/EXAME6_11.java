import java.util.*;
import java.text.*;
public class EXAME6_11
{
 public static void main(String argv[])
 {
  Date d=new Date(1119280000000L);
  DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,Locale.GERMANY);
  System.out.println(df.format(d));
 }
}