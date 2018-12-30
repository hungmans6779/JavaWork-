class Father
{
 Father()
 {
  System.out.println("A");
 }
}

class Son extends Father
{
 Son()
 {
  System.out.println("B");
 }
}

public class ExtendsTest2
{
 public static void main(String argv[])
 {
  Son son=new Son();
 }
}