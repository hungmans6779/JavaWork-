import java.util.regex.*;
public class EXAME1_1
{
 public static void main(String argv[])
 {
 	System.out.println("ab34ef45a");
 	System.out.println("012345678");
  Pattern p=Pattern.compile("\\d+?");
  //Pattern p=Pattern.compile("\\d+");
  Matcher m=p.matcher("ab34ef45a");
  while(m.find())
  {
   System.out.println(m.start()+"  "+m.group());
   //System.out.prin
  }
 }
}