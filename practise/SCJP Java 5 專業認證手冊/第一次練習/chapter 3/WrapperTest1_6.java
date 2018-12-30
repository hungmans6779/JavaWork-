public class WrapperTest1_6
{
 public static void main(String argv[])
 {
  double d1=Double.parseDouble("3.46");
  System.out.println("d1="+d1);
  Double d2=Double.valueOf("3.46");
  System.out.println("d2="+d2);
  long l1=Long.parseLong("1000100",2);
  System.out.println("l1="+l1);
  Long l2=Long.valueOf("1000100",2);
  System.out.println("l2="+l2);
 }
}