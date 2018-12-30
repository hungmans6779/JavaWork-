public class InstanceOfTest1
{
 public static void main(String argv[])
 {
  A a=new B();
  if(a instanceof B)
  {
   System.out.println("true");
  }
  else
  {
   System.out.println("false");	
  }	
 }
}

class A{}
class B extends A{}
class C extends A{}