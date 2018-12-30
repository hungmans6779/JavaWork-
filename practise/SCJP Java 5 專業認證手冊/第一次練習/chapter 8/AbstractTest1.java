abstract class Dog
{
 public abstract void run();
}
public class AbstractTest1
{
 public static void main(String argv[])
 {
  Dog dog=new Dog()
  {
   public void run()
   {
    System.out.println("Dog run");
   }
  };
  dog.run();
 }
}