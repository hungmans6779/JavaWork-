public class StringBuilderTest31
{
 public static void main(String argv[])
 {
  StringBuilder sb=new StringBuilder("1234567890");
  sb.replace(0,3,"Java");
  System.out.println("sb="+sb);
 }
}