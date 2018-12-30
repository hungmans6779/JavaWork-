import java.text.*;
public class EXAME102_1
{
 public static void main(String argv[])
 {
  NumberFormat nf=NumberFormat.getInstance();
  nf.setMaximumFractionDigits(4);
  nf.setMinimumFractionDigits(2);
  String a=nf.format(3.1415926);
  String b=nf.format(2);
  String c=nf.format(3.3334353);
  String d=nf.format(4.1);
  System.out.println("a = "+a);
  System.out.println("b = "+b);
  System.out.println("c = "+c);
  System.out.println("d = "+d);
 }
}