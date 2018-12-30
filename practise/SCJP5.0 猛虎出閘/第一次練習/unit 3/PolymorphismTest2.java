class Father
{
 String name="Father";
 public String getName()
 {
  return name;
 }
 public String geeting()
 {
  return "class Father";
 }
}
class Son extends Father
{
 String name="Son";
 public String  geeting()
 {
  return "class Son";
 }
}
public class PolymorphismTest2
{
 public static void main(String argv[])
 {
  Father f1=new Father();
  System.out.println(f1.name);
  System.out.println(f1.getName());
  System.out.println(f1.geeting());
  System.out.println("=============================");
  Father f2=new Son();
  System.out.println(f2.name);
  System.out.println(f2.getName());
  System.out.println(f2.geeting());
  System.out.println("=============================");
  System.out.println(((Son)f2).name);
  System.out.println(((Son)f2).getName());
  System.out.println(((Son)f2).geeting());
 
 }
}

