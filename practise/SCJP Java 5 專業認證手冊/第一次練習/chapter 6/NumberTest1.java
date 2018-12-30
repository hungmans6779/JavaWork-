import java.text.*;
import java.util.*;
public class NumberTest1
{
 public static void main(String argv[])
 {
  float num=132.23f;
  Locale loc=new Locale("fr");
  NumberFormat ff[]=new NumberFormat[4];
  ff[0]=NumberFormat.getInstance();
  ff[1]=NumberFormat.getInstance(loc);
  ff[2]=NumberFormat.getCurrencyInstance();
  ff[3]=NumberFormat.getCurrencyInstance(loc);
  for(NumberFormat nf:ff)
  {
   System.out.println(nf.format(num));	
  }	
 }
}