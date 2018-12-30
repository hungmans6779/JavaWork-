interface Foo
{
 int bar();
}

public class EXAME44
{
	
 /*	
 class A implements Foo
 {
  public int bar()
  {
   return 1;
  }
 }
 */
  
 public int fubar(Foo foo)
 {
  return foo.bar();
 }
 public void testFoo()
 {
 	
 	
  class A implements Foo
  {
   public int bar()
   {
    return 2;
   }
  }
  
  System.out.println(fubar(new A()));
 }
 public static void main(String argv[])
 {
  new EXAME44().testFoo();
 }
}