import java.util.regex.*;
public class PatternTest1
{
 public static void main(String argv[])
 {
  Pattern pn=Pattern.compile("JAVA [EMS]{2}.*",Pattern.CASE_INSENSITIVE);
  Matcher mc1=pn.matcher("JAVA SE 5.0");
  Matcher mc2=pn.matcher("JAVA eE 1.4.2");
  Matcher mc3=pn.matcher("JAVA me 1.0");
  Matcher mc4=pn.matcher("JAVA S 9.0");
  Matcher mc5=pn.matcher("JAVA AB 8.0");
  System.out.println(mc1.matches());
  System.out.println(mc2.matches());
  System.out.println(mc3.matches());
  System.out.println(mc4.matches());
  System.out.println(mc5.matches());
 
 }
}