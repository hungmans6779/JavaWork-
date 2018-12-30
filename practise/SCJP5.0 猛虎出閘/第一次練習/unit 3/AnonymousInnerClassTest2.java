abstract class AbstractClass
{
 abstract void show();	
}	

public class AnonymousInnerClassTest2
{
 public static void main(String argv[])
 {
 	new AbstractClass()
 	{
 	 void show()
 	 {
 	 	System.out.println("我是匿名類別");
 	 }	
 	}.show();	
 }		
	
}	