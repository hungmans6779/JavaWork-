class A
{
 static String name="A";
 static String greeting()
 {
  return "class A";
 }
}

class B extends A
{
 static String name="B";
 static String greeting()
 {
  return "class B";
 }
}

public class PolymorphismTest1
{
 public static void main(String argv[])
 {
  A b=new B();
  System.out.println(b.name);
  System.out.println(b.greeting());
 }
}