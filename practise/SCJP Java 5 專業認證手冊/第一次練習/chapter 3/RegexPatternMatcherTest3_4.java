import java.util.regex.*;
public class RegexPatternMatcherTest3_4
{
 public static void main(String argv[])
 {
  System.out.println("gB3er12Dfeweef3");
  System.out.println("01234567890123");
  Pattern p=Pattern.compile("[a-e]");
  Matcher m=p.matcher("gB3er12Dfeweef3");
  boolean b=false;
  while(b=m.find())
  {
   System.out.println(m.start()+" "+m.group());
  }
 }
}