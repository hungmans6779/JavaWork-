import java.util.*;
public class GregorianCalendarTest2
{
 public static void main(String argv[])
 {
  GregorianCalendar gc=new GregorianCalendar();
  String now=gc.get(GregorianCalendar.YEAR)+"�~ "+
             (gc.get(GregorianCalendar.MONTH)+1)+"�� "+
             gc.get(GregorianCalendar.DATE)+"�� "+
             gc.get(GregorianCalendar.HOUR)+"�� "+
             gc.get(GregorianCalendar.MINUTE)+"�� "+
             gc.get(GregorianCalendar.SECOND)+"��";
  System.out.println("�{�b���q�����ɶ��� : "+now);                  
 }
}