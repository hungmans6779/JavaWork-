interface Dog
{
 String name="Pet";
 void move();
 void skill();
}


public class AnonymousOutTest1
{
 public static void main(String argv[])
 {
  Dog d=new Dog()
  {
   public void move()
   {
    System.out.println("�ڷ|�]�]����");
   }
   public void skill()
   {
    System.out.println("�ڷ|���y......");
   }
   public void sound()
   {
   	System.out.println("�ڪ��S��~���O�ۺq..........");
   }	
  };
  System.out.println("�ڪ��W�r�s "+d.name);
  d.move();
  d.skill();
  ((AnonymousOutTest1$1)d).sound();
 }
}