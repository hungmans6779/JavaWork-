import java.text.*;
public class DecimalFormatTest1
{
 public static void main(String argv[])
 {
  int total=68*464*4626;
  System.out.println("總共有 : "+total+" 元.");
  DecimalFormat df=new DecimalFormat();
  System.out.println("總共有 : "+df.format(total)+" 元.");
 }
}