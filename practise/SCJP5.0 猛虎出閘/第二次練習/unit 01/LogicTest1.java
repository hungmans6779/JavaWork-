public class LogicTest1
{
 public static void main(String argv[])
 {
  m1(1,2);
  m2(1,2);
 }
 static void m1(int a,int b)
 {
 	if((a<b)|(++a>0))
  {}
  System.out.println("a="+a);
 }	
 static void m2(int a,int b)
 {
 	if((a<b)||(++a>0))
  {}
  System.out.println("a="+a);
 }	
}