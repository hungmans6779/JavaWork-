class FinalTest1
{
 //final static int EF;
 final static int FF=100;	
 public FinalTest1()
 {
  final int F;
  F=10;
 }
 int aMethod(int i)
 {
 	final int value;
 	value=i;
 	System.out.println("value = "+value);
 	return value;

 }	
 public static void main(String argv[])
 {
 	FinalTest1 t=new FinalTest1();
 	//FF=100;
 	System.out.println(t.aMethod(20));
 	System.out.println(t.aMethod(30));
 	System.out.println(new FinalTest1().aMethod(10));
 }	
}