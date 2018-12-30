public class EXAME1_8
{
 public static void main(String argv[])
 {
  StringBuffer a=new StringBuffer("Java ");
  StringBuffer b=new StringBuffer("Hello ");
  changeSB(a,b);
  System.out.println(a);
 }
 static void changeSB(StringBuffer s1,StringBuffer s2)
 {
  s1.append(123);
  s2.append("ABC");
  s1=s2;
  System.out.println("s1 = "+s1);
 }
}