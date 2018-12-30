import java.util.Date;
public class DateTest3
{
 public static void main(String argv[])
 {
  Date date=new Date();
  date.setTime(1000*60*60*24+date.getTime());
  System.out.println(date);
 }
}