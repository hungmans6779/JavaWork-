import java.util.*;
import java.text.SimpleDateFormat;
public class Test36
{
 public static void main(String argv[])
 {
  Date now=new Date();
  SimpleDateFormat sdf1=new SimpleDateFormat("yyyy�~MM��dd��HH��mm��ss��");
  System.out.println(sdf1.format(now));
 }
}