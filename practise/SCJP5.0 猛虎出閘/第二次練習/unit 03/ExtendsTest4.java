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
  this('A');
  System.out.println("B");
 }
 Son(char c)
 {
  super(c);
 }
}

public class ExtendsTest4 
{
 public static void main(String argv[])
 {
  Son son=new Son();
 }
}