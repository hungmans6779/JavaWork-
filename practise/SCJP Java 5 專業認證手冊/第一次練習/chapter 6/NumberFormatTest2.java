import java.text.*;
public class NumberFormatTest2
{
 public static void main(String argv[])
 {
  float num=123.34f;
  NumberFormat nf=NumberFormat.getInstance();
  System.out.print(nf.getMaximumFractionDigits()+" ");
  System.out.print(nf.format(num)+" ");
  nf.setMaximumFractionDigits(5);
  System.out.println(nf.format(num));
  try
  {
   System.out.println(nf.parse("1234.567"));
   nf.setParseIntegerOnly(true);
   System.out.println(nf.parse("1234.567"));
  }
  catch(ParseException pe)
  {
   pe.printStackTrace();
   System.out.println(pe.getMessage());
   System.out.println(pe.getLocalizedMessage());	
  }		
 }
}