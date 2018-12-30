interface Pet
{
 String attr="cute";
 public static final String name="ABC";
 void skill();
 public abstract void move();
}

public class InterfaceTest2
{
  public static void main(String argv[])
 {
 	 Pet p=new Pet()
 	 {
 	  public void move()
 	  {
 	   System.out.println("·|¶]¶]¸õ¸õ...");
 	  }
 	  public void skill()
 	  {
 	   System.out.println("·|¬¼Ây...");
 	  }
 	 };
 	 p.move();
 	 p.skill();
 }		
}
