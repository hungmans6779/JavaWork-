public class StringTest1
{
 public static void main(String argv[])
 {
  String s1=new String();
  s1="Java Hello";
  System.out.println("s1 = "+s1);
  String s2=new String("Java Hello");
  System.out.println("s2 = "+s2);
  String s3="Java Hello";
  System.out.println("s3 = "+s3);
  System.out.println("s1==s2 : "+(s1==s2));
  System.out.println("s1==s3 : "+(s1==s3));
  System.out.println("s2==s3 : "+(s2==s3));
  System.out.println("s1.equals(s2) : "+(s1.equals(s2)));
  System.out.println("s1.equals(s3) : "+(s1.equals(s3)));
  System.out.println("s2.equals(s3) : "+(s2.equals(s3)));
 }
}