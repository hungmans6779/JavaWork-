class Animal
{
 public void eat()
 {
  System.out.println("Animal eat");
 }
}


public class AnonymousInnerClassTest3
{
 public static void main(String argv[])
 {
  Animal a=new Animal()
  {
   public void eat()
   {
    System.out.println("���I�O�Q�ڦY��F");
   }
   public void run()
   {
   	System.out.println("�ڤ]�|�]��");
   }	
  };
  a.eat();
  //a.run();
 }
}