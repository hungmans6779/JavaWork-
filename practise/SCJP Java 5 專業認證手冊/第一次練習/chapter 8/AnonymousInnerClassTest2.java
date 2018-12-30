class Animal
{
 public void eat()
 {
  System.out.println("Animal eat");
 }
}


public class AnonymousInnerClassTest2
{
 public static void main(String argv[])
 {
  new Animal()
  {
   public void eat()
   {
    System.out.println("哈！是被我吃到了");
   }
   public void run()
   {
   	System.out.println("我也會跑呦");
   }	
  }.run();
 }
}