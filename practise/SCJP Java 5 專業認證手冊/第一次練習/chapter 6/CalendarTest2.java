import java.util.*;
public class CalendarTest2
{
 public static void main(String argv[])
 {
  Date d1=new Date(1000000000000L);
  System.out.println("�@���@���ɶ��O : "+d1.toString());
  Calendar c=Calendar.getInstance();
  c.setTime(d1);
  if(c.SUNDAY==c.getFirstDayOfWeek())
  {	
   System.out.println("Sunday is the first day of the week");	
  }
  System.out.println("�O�@��§������ "+c.get(c.DAY_OF_WEEK)+" ��");
  System.out.println("�O�ӭӤ������ "+c.get(c.DAY_OF_MONTH)+" ��");
  System.out.println("�O�@�~�������� "+c.get(c.DAY_OF_YEAR)+" ��");
  c.add(Calendar.DATE,1);	
  System.out.println("�O�@��§������ "+c.get(c.DAY_OF_WEEK)+" ��");
  System.out.println("�O�ӭӤ������ "+c.get(c.DAY_OF_MONTH)+" ��");
  System.out.println("�O�@�~�������� "+c.get(c.DAY_OF_YEAR)+" ��");
  Date d2=c.getTime();
  System.out.println("�j�Ѥ��᪺�ɶ��O : "+d2.toString());
 }
}