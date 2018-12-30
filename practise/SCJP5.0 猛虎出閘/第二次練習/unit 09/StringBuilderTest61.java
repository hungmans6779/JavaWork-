public class StringBuilderTest61
{
 public static void main(String argv[])
 {
  StringBuilder sb=new StringBuilder("123456789");
  sb.substring(0,3).delete(0,3).replace(0,2,"Java");
 }
}