class A
{
 String name="A";
 String getName()
 {
  return name;
 }
 String greeting()
 {
  return "class A";
 }
}

class B extends A
{
 String name="B";
 String greeting()
 {
  return "class B";
 }
}
public class Ex132
{
 public static void main(String argv[])
 {
  A a=new A();
  A b=new B();
  System.out.println(a.greeting()+" has name "+a.getName());
  System.out.println(b.greeting()+" has name "+b.getName());
  System.out.println( ((B)b).getName());
 }
}