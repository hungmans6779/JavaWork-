import java.util.regex.*;
public class RegexPatternMatcherTest7
{
 public static void main(String argv[])
 {
  Pattern p=Pattern.compile(".*?xx");
  Matcher m=p.matcher("xyxxzzxx");
  boolean b=false;
  while(b=m.find())
  {
   System.out.println(m.start()+m.group());
  }
 }
}