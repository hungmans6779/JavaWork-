interface Pet
{
 public static final String str="cutte";
 public abstract void show();
 public abstract void skill();
}

public class AnonymousInnerClass
{
 public static void main(String argv[])
 {
  Pet p=new Pet()
  {
   public void show()
   {
    System.out.println("�ڷ|�ۺq");
   }
   public void skill()
   {
    System.out.println("�ڷ|����");
   }
  };
  p.skill();
  p.show();
 }
}