class A
{
 static String name="A";
 static String geeting()
 {
  return "class A";
 }
}

class B extends A
{
 static String name="B";
 static String geeting()
 {
  return "class B";
 }
 public static void main(String argv[])
 {
  A a=new B();
  System.out.println(a.name);
  System.out.println(a.geeting());
  System.out.println(((B)a).geeting());
 }
}