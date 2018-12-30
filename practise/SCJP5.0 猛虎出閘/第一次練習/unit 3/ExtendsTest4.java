class Father
{
 public Father(String s)
 {
  System.out.println(s);
 }
}
class Son extends Father
{
 public Son()
 {
  this("Father");
  System.out.println("Son");
 }
 public Son(String s)
 {
  super(s);
 }
}
public class ExtendsTest4
{
 public static void main(String argv[])
 {
  new Son();
 }
}