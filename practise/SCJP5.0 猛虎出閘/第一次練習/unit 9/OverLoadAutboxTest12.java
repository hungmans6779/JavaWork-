public class OverLoadAutboxTest12
{
 public static void main(String argv[])
 {
  Integer i=100;
  int j=200;
  foo(i);
  foo(j);
 }
 static void foo(int ... value)
 {
 	for(int x:value)
 	{
   System.out.println("int varage x = "+x);
  } 
 }
}