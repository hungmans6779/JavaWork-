import java.util.Date;
public class DateTest2
{
 public static void main(String argv[])
 {
  System.out.println(new Date());
  System.out.println(new Date(0));
  System.out.println(new Date(1000));
  System.out.println(new Date(1000*60*60*24));
 }
}