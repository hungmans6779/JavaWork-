class Zoo
{
 public String coolMethod()
 {
  return "Wow baby";
 }
}

public class MooTest1 extends Zoo
{
 public static void main(String argv[])
 {
  new MooTest1().useCoolMethod();
 }
 public void useCoolMethod()
 {
 	System.out.println("Moo says, "+this.coolMethod());
 	Zoo zoo=new Zoo();
 	System.out.println("Moo says, "+zoo.coolMethod());
 }	
}