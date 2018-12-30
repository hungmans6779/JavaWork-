import java.util.regex.*;
public class RegexPatternMatcherTest3
{
 public static void main(String argv[])
 {
 	System.out.println("\\n");
  System.out.println("abc3121cdef213");
  System.out.println("01234567890123");
  Pattern p=Pattern.compile("\\d");
  Matcher m=p.matcher("abc3121cdef213");
  boolean b=false;
  while(b=m.find())
  {
    System.out.println(m.start()+" "+m.group());
  }
 }
}