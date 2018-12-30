abstract class Super
{
 int i;	
 abstract void get();
}

abstract public class AbstractTest2 extends Super
{
 public static void main(String argv[])
 {
  Super s=new Super()
  {
   public void get()
   {
    System.out.println("Abstract");
   }
  };
  s.get();
 }
}