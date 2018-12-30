interface Dog1
{
 void move();
}

public class AnonymouseInterfaceTest1
{
 public static void main(String argv[])
 {
  new Dog1()
  {
   public void move()
   {
    System.out.println("§Ú·|¶]­C......");
   }
  }.move();
 }
}