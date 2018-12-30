public class OverloadVarargsTest1
{
 public static void main(String argv[])
 {
 	int a[][]={{2,3,4,},{3,4}};
 	int b[]=(int[])a[1];
 	for(int i:b)
 	{
 	 System.out.println(i);	
 	}	
 	
  short s=10;
  go(s);
 }
 static void go(short g)
 {
  System.out.println("short1");
 }
 static void go(short ... v)
 {
  System.out.println("short2");
 }
}