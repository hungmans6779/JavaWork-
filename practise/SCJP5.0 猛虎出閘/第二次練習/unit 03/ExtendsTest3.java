class Father
{
 Father(char c)
 {
  System.out.println(c);
 }
}

class Son extends Father
{
 Son()
 {
  super('A');
  System.out.println("B");
 }
}

public class ExtendsTest3
{
 public static void main(String argv[])
 {
  Son son=new Son();
 }
}