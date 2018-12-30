public class StringTest2_1
{
 public static void main(String argv[])
 {
  String s1="Hello ";
  String s2=s1;
  s1=s1.concat(" Java");
  System.out.println("s1 = "+s1);
  System.out.println("s2 = "+s2);
 }
}