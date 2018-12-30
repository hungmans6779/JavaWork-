interface Pet
{
 public static final String str="cutte";
 public abstract void skill();
}

public class AnonymousInnerClassTest1
{
 public static void main(String argv[])
 {

  
  new Pet()
  {
   public void skill()
   {
   	System.out.println("§Ú·|´¤¤â");
   }	
  }.skill();	
 
 }
}