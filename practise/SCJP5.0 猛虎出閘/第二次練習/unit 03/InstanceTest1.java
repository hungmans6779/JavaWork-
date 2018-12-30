class Organism{}
class Animal extends Organism {}
class Mammalian extends Animal {}
public class InstanceTest1
{
 public static void main(String argv[])
 {
  Animal animal;
  if(new Mammalian() instanceof Animal)
  {
   animal=(Animal)new Mammalian();
   System.out.println("轉換成功");
  }
  else
  {
   System.out.println("該型別不能轉換");	
  }		
 }
}