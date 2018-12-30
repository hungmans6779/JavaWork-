public class StringTest3
{
 public static void main(String argv[])
 {
  String s1=" Hella Java   ";
  System.out.println(s1);
  s1=s1.trim();
  System.out.println(s1);
  s1=s1.replace('a','o');
  System.out.println(s1.charAt(1));
  System.out.println("s1 = "+s1);
  System.out.println(s1.substring(0,4));
  System.out.println("s1 ªºlength = "+s1.length());
  System.out.println(s1.toUpperCase());
  System.out.println(s1.toLowerCase());
  System.out.println(s1.toString());
 }
}