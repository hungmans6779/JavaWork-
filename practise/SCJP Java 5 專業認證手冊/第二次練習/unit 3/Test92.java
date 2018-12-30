public class Test92
{
 public static void main(String argv[])
 {
  byte b=5;
  go(b);
 }
 public static void go(Object o)
 {
  Byte b=(Byte)o;
  System.out.println(b);	
 }	
}