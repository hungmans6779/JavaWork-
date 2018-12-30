import java.util.regex.*;
public class RegexPatternMatcherTest6
{
 public static void main(String argv[])
 {
  System.out.println("ac abc a c aaac avvdc aac");
  System.out.println("0000000000111111111122222");
  System.out.println("0123456789012345678901234");
  Pattern p=Pattern.compile("(a.c)");
  Matcher m=p.matcher("ac abc a c aaac avvdc aac");
  boolean b=false;
  while(b=m.find())
  {
   System.out.println(m.start()+"  "+m.group());
  }
 }
}