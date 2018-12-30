import java.util.regex.*;
public class RegexPatternMatcherTest3_3
{
 public static void main(String argv[])
 {
  System.out.println("ab3ef12dfcdef3");
  System.out.println("01234567890123");
  Pattern p=Pattern.compile("[abc]");
  Matcher m=p.matcher("ab3ef12dfcdef3");
  boolean b=false;
  while(b=m.find())
  {
   System.out.println(m.start()+" "+m.group());
  }
 }
}