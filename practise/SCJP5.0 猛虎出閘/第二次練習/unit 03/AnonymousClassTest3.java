interface Pet
{
 void move();
 void skill();
}

public class AnonymousClassTest3
{
 public static void main(String argv[])
 {
  Pet p=new Pet()
  {
   public void move()
   {
    System.out.println("我會跑步");
   }
   public void skill()
   {
    System.out.println("我會狩獵");
   }
   public void sound()
   {
    System.out.println("我會唱歌");	
   }	
  };
  p.move();
  p.skill();
  ((AnonymousClassTest3$1)p).sound();
 }

}