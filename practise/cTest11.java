import java.util.*;
import java.text.*;
public class cTest11
{
 public static void main(String argv[])
 {
 	Date now=new Date();
 	System.out.println("�{�b���ɶ��O:"+(now.getYear()+1900)+"�~ "+(now.getMonth()+1)+"��"+now.getDate()+"�� �P��"+now.getDay());
 	
 	DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,Locale.ITALY);
 	System.out.println("�{�b���ɶ��O:"+df.format(now));
 	
 	SimpleDateFormat sdf=new SimpleDateFormat("yyyy�~MM��dd��E");
 	System.out.println("�{�b���ɶ��O:"+sdf.format(now));
 }	
}