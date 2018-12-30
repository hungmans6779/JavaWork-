import java.util.regex.*;
public class EXAME1
{
 public static void main(String argv[])
 {
 	System.out.println("ab34ef");
 	System.out.println("012345");
  Pattern p=Pattern.compile("\\d*");
  //Pattern p=Pattern.compile("\\d+");
  Matcher m=p.matcher("ab34ef");
  while(m.find())
  {
   System.out.println(m.start()+"  "+m.group());
   //System.out.prin
  }
 }
}