public class EX25
{
 public static void main(String argv[])
 {
  Super s=new Super()
  {
   {
    System.out.println("�ثe���غc�l : "+this);
   } 
   void m()
   {
    System.out.println("�л\�Lm����k�I�I�I");
   }
   void n()
   {
    System.out.println("�ۭq��n��k.............");
   }
  };
  
  s.m();
 }
}

class Super
{
 void m()
 {
  System.out.println("Super ���骺m��k");
 }
}