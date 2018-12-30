public class StringBuilderTest2
{
 public static void main(String argv[])
 {
  StringBuilder sb=new StringBuilder("abc");
  sb.append("def").reverse().insert(3,"---");
  System.out.println(sb);
 }
}