import java.util.*;
import java.text.*;
public class cTest15
{
 public static void main(String argv[])
 {
  Calendar c=Calendar.getInstance();
  c.setTime(new Date("1995/04/02"));
  c.add(Calendar.MONTH,100);
  System.out.println(DateFormat.getInstance().format(c.getTime()));
 }
}