import java.util.*;
import java.text.*;
public class cTest11
{
 public static void main(String argv[])
 {
 	Date now=new Date();
 	System.out.println("現在的時間是:"+(now.getYear()+1900)+"年 "+(now.getMonth()+1)+"月"+now.getDate()+"日 星期"+now.getDay());
 	
 	DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,Locale.ITALY);
 	System.out.println("現在的時間是:"+df.format(now));
 	
 	SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日E");
 	System.out.println("現在的時間是:"+sdf.format(now));
 }	
}