import java.text.*;
public class DecimalFormatTest2
{
 public static void main(String argv[])
 {
  int total=68*464*4626*35342;
  System.out.println("�`�@�� : "+total+" ��.");
  DecimalFormat df=new DecimalFormat("$####,####,####,####");
  System.out.println("�`�@�� : "+df.format(total)+" ��.");
 }
}