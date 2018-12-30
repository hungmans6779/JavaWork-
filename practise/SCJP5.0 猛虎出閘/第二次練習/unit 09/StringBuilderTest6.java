public class StringBuilderTest6
{
 public static void main(String argv[])
 {
  StringBuilder sb=new StringBuilder("123456789");
  String str=sb.substring(0,100);
  System.out.println("str="+str);
 }
}