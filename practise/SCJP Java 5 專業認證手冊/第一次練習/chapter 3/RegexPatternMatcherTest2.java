import java.util.regex.*;
public class RegexPatternMatcherTest2
{
 public static void main(String argv[])
 {
  System.out.println("abababa");
  System.out.println("0123456");
  Pattern p=Pattern.compile("aba");
  Matcher m=p.matcher("abababa");
  boolean b=false;
  while(b=m.find())
  {
     System.out.println(m.start()+" "+m.group());
  }
 }
}