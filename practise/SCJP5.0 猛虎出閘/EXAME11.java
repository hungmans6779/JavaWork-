import java.util.*;
import java.text.*;
public class EXAME11
{
 public static void main(String argv[])
 {
 	Date d=new Date();
 	DateFormat df=DateFormat.getDateInstance();
  
  
  Locale loc=Locale.getDefault();
  System.out.println(loc.getDisplayCountry()+" "+df.format(d));
  
  /* �sĶ����
  Locale loc=Locale.getDefault();
  System.out.println(loc.getDisplayCountry()+" "+df.setDateFormat(d));
  */
  /* �sĶ����
  Locale loc=Locale.getLocale();
  System.out.println(loc.getDisplayCountry());
  */
  /*�sĶ����
  Locale loc=Locale.getLocale();
  System.out.println(loc.getDisplayCountry()+" "+df.setDateFormat(d));
  */
 }
}