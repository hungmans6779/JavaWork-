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
    System.out.println("���I�O�Q�ڦY��F");
   }
  }.eat();
 }
}