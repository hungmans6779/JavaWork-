import java.text.*;
public class DecimalFormatTest2
{
 public static void  main(String argv[])
 {
  double value=12345.67890;
  DecimalFormat d1=new DecimalFormat("####,####.##");
  DecimalFormat d2=new DecimalFormat("0000,0000.00");
  DecimalFormat d3=new DecimalFormat("####,####.00");
  System.out.println("d1��value="+d1.format(value));
  System.out.println("d2��value="+d2.format(value));
  System.out.println("d3��value="+d3.format(value));
 }
}