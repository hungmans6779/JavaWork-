public class StringBuilderTest5
{
 public static void main(String argv[])
 {
  StringBuilder sb=new StringBuilder("123456789");
  sb.delete(0,3).replace(0,100,"Java");
  System.out.println("sb="+sb);
 }
}