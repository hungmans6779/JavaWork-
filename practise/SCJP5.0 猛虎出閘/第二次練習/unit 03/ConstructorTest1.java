public class ConstructorTest1
{
 ConstructorTest1()
 {
  System.out.println("����FConstructorTest1()�غc�l");
 }
 public static void main(String argv[])
 {
  ConstructorTest1 c1=new ConstructorTest1();
  new ConstructorTest1();
 }
}