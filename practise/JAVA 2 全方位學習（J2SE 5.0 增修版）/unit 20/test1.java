public class test1
{
 public static void main(String argv[])
 {
  String str1=new String("Hello");
  String str2="Hello";
  System.out.println(str1.equals(str2));
  System.out.println(str1==str2);
  String str3="Hello";
  System.out.println(str2==str3);
 }
}