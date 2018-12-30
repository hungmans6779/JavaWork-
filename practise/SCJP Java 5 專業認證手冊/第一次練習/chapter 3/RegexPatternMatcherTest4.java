import java.util.regex.*;
public class RegexPatternMatcherTest4
{
 public static void main(String argv[])
 {
 	System.out.println("abcd232dfd323ad3213a");
 	System.out.println("01234567890123456789");
  Pattern p=Pattern.compile("\\d");
  Matcher m=p.matcher("abcd232dfd323ad3213a");
  boolean b=false;
  while(b=m.find())
  {
   System.out.println(m.start()+" "+m.group());	
  }	
  
 }
}