class Test
{
 public Test()
 {
  System.out.println("Test");
 }
}


public class ConstructorTest3
{
 Test t=new Test();
 public ConstructorTest3()
 {
  System.out.println("ConstructorTest3");
 }
 public static void main(String argv[])
 {
  new ConstructorTest3();
 }
}