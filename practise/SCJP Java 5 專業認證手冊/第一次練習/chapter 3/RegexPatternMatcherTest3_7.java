import java.util.regex.*;
public class RegexPatternMatcherTest3_7
{
 public static void main(String argv[])
 {
  System.out.println("0x 0xg 0x123 0xggg 0x3432");
  System.out.println("0000000000111111111122222");
  System.out.println("0123456789012345678901234");
  Pattern p=Pattern.compile("0[xX]([0-9a-fA-F])+");
  Matcher m=p.matcher("0x 0xg 0x123 0xggg 0x3432");
  boolean b=false;
  while(b=m.find())
  {
   System.out.println(m.start()+" "+m.group());
  }
 }
}