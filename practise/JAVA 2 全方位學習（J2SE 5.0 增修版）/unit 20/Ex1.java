public class Ex1
{
 public static void main(String argv[])
 {
  String str1=new String("Hello");
  String str2="Hello";
  String str3=str1;
  String str4=new String("Hello");
  String str5="Hello";
 
  System.out.println(str1==str2);
  System.out.println(str1==str3);
  System.out.println(str1==str4);
  System.out.println(str2==str2);
 }

}