import java.text.*;
import java.util.*;
public class cTest16
{
 public static void main(String argv[])
 {
  NumberFormat nf=NumberFormat.getInstance();
  nf.setMaximumIntegerDigits(3);
  nf.setMinimumIntegerDigits(3);
  nf.setMaximumFractionDigits(3);
  nf.setMinimumFractionDigits(2);
  System.out.println(nf.format(23.232));
  
  System.out.println("MaximumIntegerDigits="+nf.getMaximumIntegerDigits());
  System.out.println("MinimumIntegerDigits="+nf.getMinimumIntegerDigits());
  System.out.println("MaximumFractionDigits="+nf.getMaximumFractionDigits());
  System.out.println("MinimumFractionDigits="+nf.getMinimumFractionDigits());
  
 }
}