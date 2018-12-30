import java.text.*;
import java.util.*;
public class EXAME6_05_1
{
 public static void main(String argv[])
 {
  Date d=new Date(1123631685881L);
  Locale loc=Locale.getDefault();
  DateFormat df=DateFormat.getDateInstance();
  System.out.println(df.format(d));
 }
}