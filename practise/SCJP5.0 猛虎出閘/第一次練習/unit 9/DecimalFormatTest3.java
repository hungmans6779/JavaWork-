import java.text.*;
public class DecimalFormatTest3
{
 public static void main(String argv[])
 {
  float total=665636.25625f;
  System.out.println("�`�@�� : "+total+" ��.");
  DecimalFormat df1=new DecimalFormat("$####,####,####,####.##%");
  //DecimalFormat df2=new DecimalFormat("$0000,0000,0000,####.##%");
  DecimalFormat df3=new DecimalFormat("$0000,0000,0000,0000.00%");
  System.out.println("�`�@�� : "+df1.format(total));
  //System.out.println("�`�@�� : "+df2.format(total));
  System.out.println("�`�@�� : "+df3.format(total));
 }
}