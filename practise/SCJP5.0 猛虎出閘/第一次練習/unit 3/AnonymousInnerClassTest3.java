interface Pet
{
 public abstract void show();
}

public class AnonymousInnerClassTest3
{
 public static void main(String argv[])
 {
  Pet p=new Pet()
  {
   public void show()
   {
    System.out.println("§Ú·|´¤¤â");
   }
  }; 
 }
}