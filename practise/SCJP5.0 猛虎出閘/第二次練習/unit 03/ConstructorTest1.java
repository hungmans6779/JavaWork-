public class ConstructorTest1
{
 ConstructorTest1()
 {
  System.out.println("執行了ConstructorTest1()建構子");
 }
 public static void main(String argv[])
 {
  ConstructorTest1 c1=new ConstructorTest1();
  new ConstructorTest1();
 }
}