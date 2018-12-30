public class StringBuilderTest4
{
 public static void main(String argv[])
 {
  StringBuilder sb=new StringBuilder("1234567890");
  sb=sb.delete(0,3);
  System.out.println("sb="+sb);
 }
}