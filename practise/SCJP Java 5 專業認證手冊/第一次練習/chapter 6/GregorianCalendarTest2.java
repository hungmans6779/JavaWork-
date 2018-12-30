import java.util.*;
public class GregorianCalendarTest2
{
 public static void main(String argv[])
 {
  GregorianCalendar gc=new GregorianCalendar();
  String now=gc.get(GregorianCalendar.YEAR)+"年 "+
             (gc.get(GregorianCalendar.MONTH)+1)+"月 "+
             gc.get(GregorianCalendar.DATE)+"日 "+
             gc.get(GregorianCalendar.HOUR)+"時 "+
             gc.get(GregorianCalendar.MINUTE)+"分 "+
             gc.get(GregorianCalendar.SECOND)+"秒";
  System.out.println("現在本電腦的時間為 : "+now);                  
 }
}