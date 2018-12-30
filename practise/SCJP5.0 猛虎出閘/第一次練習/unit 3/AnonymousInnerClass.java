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
    System.out.println("我會唱歌");
   }
   public void skill()
   {
    System.out.println("我會握手");
   }
  };
  p.skill();
  p.show();
 }
}