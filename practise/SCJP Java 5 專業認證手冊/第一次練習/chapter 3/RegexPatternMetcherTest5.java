import java.util.regex.*;
public class RegexPatternMetcherTest5
{
 public static void main(String argv[])
 {
 	System.out.println("test1.java,test12.java,test21.java,test13.pdf");
 	System.out.println("000000000011111111112222222222333333333344444");
 	System.out.println("012345678901234567890123456789012345678901234");
  Pattern p=Pattern.compile("test1([^,])*");
  Matcher m=p.matcher("test1.java,test12.java,test21.java,test13.pdf");
  boolean b=false;
  while(b=m.find())
  {
   System.out.println(m.start()+" "+m.group());	
  }	
 }
}
