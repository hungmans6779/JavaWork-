import java.util.regex.*;
public class EXAME6_01
{
 public static void main(String argv[])
 {
  Pattern p=Pattern.compile(argv[0]);
  Matcher m=p.matcher(argv[1]);
  boolean b=false;
  while(b=m.find())
  {
   System.out.print(m.start()+m.group());	
  }	
 }
}