import java.util.regex.*;
public class RegexPatternMatcherTest1_2
{
 public static void main(String argv[])
 {
  Pattern p=Pattern.compile("\\d\\d[^.]");
  System.out.println("140.127.115.56");
  System.out.println("01234567890123");
  Matcher m=p.matcher("140.127.115.56");
  boolean br=false;
  while(br=m.find())
  {
   System.out.println(m.start()+" "+m.group());
  }	
 }
}