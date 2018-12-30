class Father
{
 public Father()
 { 
  System.out.println("Father");
 }
}
class Son extends Father
{
 public Son()
 {
  System.out.println("Son");
 }
}
public class ExtendsTest2
{
 public static void main(String argv[])
 {
  new Son();
 }
}