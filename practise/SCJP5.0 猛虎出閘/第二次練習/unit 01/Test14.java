public class Test14
{
 public static void main(String argv[])
 {
  char c1='A';
  char c2='A';
  System.out.println("c1==c2 => "+(c1==c2));
  String s1=new String("JAVA");
  String s2=new String("JAVA");
  System.out.println("s1==s2 => "+(s1==s2));
  System.out.println("s1.equals(s2) => "+s1.equals(s2));
  System.out.println("s1.equalsIgnoreCase(s2) => "+s1.equalsIgnoreCase(s2));
  String ss1="SCJP";
  String ss2="SCJP";
  System.out.println("ss1==ss2 => "+(ss1==ss2));
 }
}