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
    System.out.println("�ڷ|�]�B");
   }
   public void skill()
   {
    System.out.println("�ڷ|���y");
   }
   public void sound()
   {
    System.out.println("�ڷ|�ۺq");	
   }	
  };
  p.move();
  p.skill();
  ((AnonymousClassTest3$1)p).sound();
 }

}