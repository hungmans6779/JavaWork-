import java.util.regex.*;
public class RegexPatternMatcherTest1
{
 public static void main(String argv[])
 {
  Pattern p=Pattern.compile("ab");
  Matcher m=p.matcher("abaaaba");
  boolean br=false;
  while(br=m.find())
  {
   System.out.print(m.start()+" ");	
  }	
 }
}