import java.util.regex.*;
public class PatternTest2
{
 public static void main(String argv[])
 {
  Pattern ptn=Pattern.compile("saw",Pattern.CASE_INSENSITIVE);
  Matcher mch=ptn.matcher("I saw a saw");
  while(mch.find())
  {
   System.out.println(mch.start()+"-"+mch.end());		
  }	
 }
}