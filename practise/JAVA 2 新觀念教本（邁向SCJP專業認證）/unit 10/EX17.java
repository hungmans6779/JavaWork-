import java.util.Formatter;
import java.util.Locale;
import java.util.Date;
public class EX17
{
 public static void main(String argv[])
 {
  Formatter f=new Formatter();
  Date d=new Date();
  f.format("%tY %1$tb %1$te¤é %1$tA\n",d);
  f.format("%tc \n%1$tr",d);
  System.out.println(f.toString());
 }
}