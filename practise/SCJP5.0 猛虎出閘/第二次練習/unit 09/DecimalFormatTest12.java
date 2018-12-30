import java.text.*;
public class DecimalFormatTest12
{
 public static void main(String argv[])
 {
  int apple=96;
  int total=apple*986*867;
  DecimalFormat df=new DecimalFormat("$0000,0000,0000");
  System.out.println(df.format(total)+" ¤¸.");
 }
}