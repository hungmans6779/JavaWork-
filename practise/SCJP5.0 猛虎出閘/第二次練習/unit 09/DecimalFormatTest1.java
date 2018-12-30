import java.text.*;
public class DecimalFormatTest1
{
 public static void main(String argv[])
 {
 	int apple=96;
 	int total=apple*986*867;
  DecimalFormat df=new DecimalFormat();
  System.out.println(df.format(total)+" ¤¸.");
 }
}