public class P7
{
 int x=5;	
 public static void main(String argv[])
 {
  final P7 f1=new P7();
  P7 f2=new P7();
  P7 f3=FizzSwitch(f1,f2);
  System.out.println((f1==f3)+" "+(f1.x==f3.x));
  System.out.println(f1.x);
 }
 public static P7 FizzSwitch(P7 x,P7 y)
 {
 	final P7 z=x;
 	z.x=6;
 	return z;
 }	
}