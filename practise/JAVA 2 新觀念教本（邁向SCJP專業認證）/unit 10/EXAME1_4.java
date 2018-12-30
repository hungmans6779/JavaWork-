public class EXAME1_4
{
 public static void main(String argv[])
 {
  String a="java";
  String b=new String("java");
  StringBuffer c=new StringBuffer(a);
  char d[]={'j','a','v','a'};
  System.out.println("A ="+(a=="java"));
  System.out.println("B ="+(a==b));
  System.out.println("C ="+(a.equals(b)));
  System.out.println("D ="+(a.equals(c)));
  System.out.println("E ="+(a.equals(d)));
 }
}