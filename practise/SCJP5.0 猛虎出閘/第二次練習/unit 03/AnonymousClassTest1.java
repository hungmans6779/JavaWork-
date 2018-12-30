interface Pet
{
 public String attr="cute";
 void skill();
 void move();
}

public class AnonymousClassTest1
{
 public static void main(String argv[])
 {
  Pet p=new Pet()
  {
   public void skill()
   {
    System.out.println("我會握手");	
   }	
   public void move()
   {
    System.out.println("我會跑步");	
   }	
  };	
  p.skill();
  p.move();
 }
}