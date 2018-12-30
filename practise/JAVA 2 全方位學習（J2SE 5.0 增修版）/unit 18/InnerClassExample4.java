public class InnerClassExample4
{
 public static void main(String argv[])
 {
 	Outter4 out=new Outter4();
 	Object obj=out.methodWithInnerClass();
 	System.out.println(obj);
 	
 }
}

class Outter4
{
 public Object methodWithInnerClass()
 {
 	class Inner
 	{
 	 public String toString()
 	 {
 	 return "This is an Inner class in a method";
 	 }		
 	}	
 	return new Inner();
 }		
	
}	

