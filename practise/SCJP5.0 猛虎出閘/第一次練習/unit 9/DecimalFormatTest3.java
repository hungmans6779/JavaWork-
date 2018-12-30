import java.text.*;
public class DecimalFormatTest3
{
 public static void main(String argv[])
 {
  float total=665636.25625f;
  System.out.println("總共有 : "+total+" 元.");
  DecimalFormat df1=new DecimalFormat("$####,####,####,####.##%");
  //DecimalFormat df2=new DecimalFormat("$0000,0000,0000,####.##%");
  DecimalFormat df3=new DecimalFormat("$0000,0000,0000,0000.00%");
  System.out.println("總共有 : "+df1.format(total));
  //System.out.println("總共有 : "+df2.format(total));
  System.out.println("總共有 : "+df3.format(total));
 }
}