import java.util.regex.*;
public class PatternTest41
{
 public static void main(String argv[])
 {
  Pattern ptn=Pattern.compile("[:/.]+");
  String data[]=ptn.split("http://www.yahoo.com.tw",2);
  for(String d:data)
   System.out.println(d);
 }
}