import java.text.*;
public class EXAME102
{
 public static void main(String argv[])
 {
  NumberFormat nf=NumberFormat.getInstance();
  nf.setMaximumFractionDigits(4);
  nf.setMinimumFractionDigits(2);
  String a=nf.format(3.1415926);
  String b=nf.format(2);
  System.out.println("a = "+a);
  System.out.println("b = "+b);
 }
}