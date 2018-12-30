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
 	super("Father");
  System.out.println("Son");
 }
}
public class ExtendsTest3
{
 public static void main(String argv[])
 {
  new Son();
 }
}