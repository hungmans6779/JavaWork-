import java.util.Date;
public class DateTest1
{
 public static void main(String argv[])
 {
  System.out.println("現在的時間為： "+new Date());
  System.out.println("格林威治的時間為: "+new Date(0));
  System.out.println("格林威治的時間多1秒為: "+new Date(1000));
  System.out.println("格林威治的時間多1天為: "+new Date(1000*60*60*24));
  Date today=new Date();
  System.out.println("到今天為止的時間為： "+today.getTime()+" 毫秒");
  today.setTime(1000*60*60*24+today.getTime());
  System.out.println(today);
 }
}