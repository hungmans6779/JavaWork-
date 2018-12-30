import java.util.regex.*;
public class RegexPatternMatcherTest3_1
{
 public static void main(String argv[])
 {
  System.out.println("ab3 12 cd ef 3");
  System.out.println("01234567890123");
  Pattern p=Pattern.compile("\\s");
  Matcher m=p.matcher("ab3 12 cd ef 3");
  boolean b=false;
  while(b=m.find())
  {
    System.out.println(m.start()+" "+m.group());
  }
 }
}