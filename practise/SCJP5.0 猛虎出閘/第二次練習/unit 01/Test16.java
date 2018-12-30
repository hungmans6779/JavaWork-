public class Test16
{
 public static void main(String argv[])
 {
  m1();
  m2();
 }
 static void m1()
 {
  int a=0,b=0;
  b=a++ + ++a - a++;
  System.out.println("a="+a+",b="+b);
 }	
 static void m2()
 {
  int a=0,b=0;
  b=a-- + --a - a--;
  System.out.println("a="+a+",b="+b);
 }		
}