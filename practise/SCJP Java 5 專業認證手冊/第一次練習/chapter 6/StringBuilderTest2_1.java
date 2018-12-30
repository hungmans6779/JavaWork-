public class StringBuilderTest2_1
{
 public static void main(String argv[])
 {
  StringBuilder sb=new StringBuilder("abc");
  sb.append("def").reverse().insert(3,"---");
  System.out.println(sb);
  sb.setLength(5);
  System.out.println(sb);
  sb.setLength(10);
  System.out.println(sb);
 }
}