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
    System.out.println("�ڷ|����");	
   }	
   public void move()
   {
    System.out.println("�ڷ|�]�B");	
   }	
  };	
  p.skill();
  p.move();
 }
}