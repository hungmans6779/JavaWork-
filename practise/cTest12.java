public class cTest12
{
 public static void main(String argv[])
 {
  int a=5;
  int c=a++ + a++;
  int a1=5;
  int c1=a1++ + ++a1;
  System.out.println(c);
  System.out.println(c1);
  
  int a2=5;
  int b=2+ ++a2;
  System.out.println(b);
 }
}