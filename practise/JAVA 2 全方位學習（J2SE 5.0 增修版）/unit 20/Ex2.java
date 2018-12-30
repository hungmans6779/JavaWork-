public class Ex2
{
 public static void main(String argv[])
 {
  String str1=new String("Hello");
  String str2="Hello";
  String str3=str1;
  String str4=new String("Hello");
  String str5="Hello";
 
  System.out.println(str1.equals(str2));
  System.out.println(str1.equals(str3));
  System.out.println(str1.equals(str4));
  System.out.println(str2.equals(str5));
 }

}