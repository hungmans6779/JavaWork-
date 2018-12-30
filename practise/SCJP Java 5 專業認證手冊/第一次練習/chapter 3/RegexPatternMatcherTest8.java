import java.util.regex.*;
public class RegexPatternMatcherTest8
{
 public static void main(String argv[])
 {
  Pattern p=Pattern.compile(argv[0]);
  Matcher m=p.matcher(argv[1]);
  System.out.println("Pattern is : "+m.pattern());
  boolean b=false;
  while(b=m.find())
  {
   System.out.println(m.start()+"  "+m.group());
  }
 }
}