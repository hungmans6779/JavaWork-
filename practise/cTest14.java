import java.util.*;
import java.text.*;
public class cTest14
{
 public static void main(String argv[])
 {
  Calendar c=Calendar.getInstance();
  c.add(Calendar.MONTH,100);
  System.out.println(DateFormat.getInstance().format(c.getTime()));
 }
}