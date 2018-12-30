import java.util.*;
import java.text.*;
public class cTest13
{
 public static void main(String argv[])
 {
  Date now=new Date();
  Date dtime=new Date(now.getTime()+(86400*1000*100l));
  DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
  System.out.println(df.format(dtime));
 }
}