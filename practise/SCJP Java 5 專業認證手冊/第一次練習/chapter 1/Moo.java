class Zoo
{
 public String coolMethod()
 {
  return "Wow baby";
 }
}

public class Moo extends Zoo
{
 public void getMethod()
 {
 	System.out.println(this.coolMethod());
  System.out.println(coolMethod());
  Zoo zoo=new Zoo();
  System.out.println(zoo.coolMethod());
 }
 public static void main(String argv[])
 {
  new Moo().getMethod();
 }
}