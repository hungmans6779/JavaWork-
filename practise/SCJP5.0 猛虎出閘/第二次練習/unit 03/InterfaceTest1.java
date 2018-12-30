interface Pet
{
 String attr="cute";
 public static final String name="ABC";
 void skill();
 public abstract void move();
}

public class InterfaceTest1 implements Pet
{
 public void skill()
 {
  System.out.println("·|¬¼Ây...");	
 }	
 public void move()
 {
  System.out.println("·|¶]¶]¸õ¸õ...");	
 }
 public static void main(String argv[])
 {
 	InterfaceTest1 i=new InterfaceTest1();
 	i.skill();
 	i.move();
 }		
}
