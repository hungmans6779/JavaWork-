import java.util.regex.*;
public class PatternTest2
{
 public static void main(String argv[])
 {
  Pattern pn=Pattern.compile("SAW",Pattern.CASE_INSENSITIVE);
  Matcher mc=pn.matcher("I saw a saw");
  while(mc.find())
  {
   System.out.println(mc.start()+" - " +(mc.end()-1));
  }
 }
}