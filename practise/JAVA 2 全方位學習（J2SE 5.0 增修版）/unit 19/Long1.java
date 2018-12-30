public class Long1
{
 public static void main(String argv[])
 {
  long l1=Long.parseLong("123");
  System.out.println(l1);
  long l2=Long.valueOf("456").longValue();
  System.out.println(l2);
 }
}