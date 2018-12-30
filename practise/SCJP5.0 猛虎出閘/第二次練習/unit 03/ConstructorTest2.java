public class ConstructorTest2
{
 protected ConstructorTest2(String s)
 {
  System.out.println("Java "+s);
 }
 public static void main(String arg[])
 {
  ConstructorTest2 c=new ConstructorTest2("5");
 }
}