import java.text.*;
public class DecimalFormatTest3
{
 public static void main(String argv[])
 {
  double value=0.123456;
  DecimalFormat df=new DecimalFormat(".##%");
  System.out.println("df ªºvalue="+df.format(value));
 }
}