public class StringBuilderTest11
{
 public static void main(String argv[])
 {
  StringBuilder sb=new StringBuilder("Java ");
  sb.append("SCJP ").append("5.0");
  System.out.println("sb="+sb);
  System.out.println("length="+sb.length());
  System.out.println("capacity="+sb.capacity());
 }
}