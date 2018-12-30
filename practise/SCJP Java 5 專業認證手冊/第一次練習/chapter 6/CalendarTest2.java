import java.util.*;
public class CalendarTest2
{
 public static void main(String argv[])
 {
  Date d1=new Date(1000000000000L);
  System.out.println("一億毫秒的時間是 : "+d1.toString());
  Calendar c=Calendar.getInstance();
  c.setTime(d1);
  if(c.SUNDAY==c.getFirstDayOfWeek())
  {	
   System.out.println("Sunday is the first day of the week");	
  }
  System.out.println("是一個禮拜的第 "+c.get(c.DAY_OF_WEEK)+" 天");
  System.out.println("是該個月份的第 "+c.get(c.DAY_OF_MONTH)+" 天");
  System.out.println("是一年之中的第 "+c.get(c.DAY_OF_YEAR)+" 天");
  c.add(Calendar.DATE,1);	
  System.out.println("是一個禮拜的第 "+c.get(c.DAY_OF_WEEK)+" 天");
  System.out.println("是該個月份的第 "+c.get(c.DAY_OF_MONTH)+" 天");
  System.out.println("是一年之中的第 "+c.get(c.DAY_OF_YEAR)+" 天");
  Date d2=c.getTime();
  System.out.println("隔天之後的時間是 : "+d2.toString());
 }
}