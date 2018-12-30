class Father
{
 static String name="Father";
 static String geeting()
 {
  return "class Father";
 }
}
class Son extends Father
{
 static String name="Son";
 static String geeting()
 {
  return "class Father";
 }
}
public class PolymorphismTest3
{
 public static void main(String argv[])
 {
  Father f1=new Son();
  System.out.println(f1.name);
  System.out.println(f1.geeting());
  System.out.println("================");
  Son s=new Son();
  System.out.println(s.name);
  System.out.println(s.geeting());
 }
}