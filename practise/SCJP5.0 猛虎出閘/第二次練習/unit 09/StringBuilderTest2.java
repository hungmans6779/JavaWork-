public class StringBuilderTest2
{
 public static void main(String argv[])
 {
  StringBuilder sb=new StringBuilder("1234567890");
  String str=sb.substring(0,2);
  System.out.println("str="+str);
 }
}