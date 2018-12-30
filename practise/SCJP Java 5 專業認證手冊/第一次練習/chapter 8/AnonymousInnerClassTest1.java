class Animal
{
 public void eat()
 {
  System.out.println("Animal eat");
 }
}


public class AnonymousInnerClassTest1
{
 public static void main(String argv[])
 {
  new Animal()
  {
   public void eat()
   {
    System.out.println("哈！是被我吃到了");
   }
  }.eat();
 }
}