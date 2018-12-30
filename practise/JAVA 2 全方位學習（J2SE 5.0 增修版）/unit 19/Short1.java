public class Short1
{
 public static void main(String argv[])
 {
  short s1=Short.parseShort("123");
  System.out.println(s1);
  short s2=Short.valueOf("456").shortValue();
  System.out.println(s2);
 }
}