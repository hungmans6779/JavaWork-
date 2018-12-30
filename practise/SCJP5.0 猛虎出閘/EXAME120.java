import com.sun.scjp.Geodetics;
public class EXAME120
{
 public double value()
 {
  return Geodetics.PPI/23;
 }
 public static void main(String argv[])
 {
  System.out.println(new EXAME120().value());
 }
}