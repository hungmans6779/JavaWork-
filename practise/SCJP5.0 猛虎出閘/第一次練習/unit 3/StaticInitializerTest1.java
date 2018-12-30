class StaticInitializerTest1
{
 static int i;
 
 static
 {
 	i=10;
 }	

 
 public static void main(String argv[])
 {
 	System.out.println(i);
 	System.out.println(new StaticInitializerTest1().i);
 }	
}