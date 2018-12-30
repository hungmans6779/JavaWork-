public class EX19
{
 public static void main(String argv[])
 {
  Dog d[]=new Dog[3];
  d[0]=new WolfDog();
  d[1]=new DoberMan();
  d[2]=new Dog();
  for(int i=0;i<3;i++)
  {
   d[i].bark();
  }
 }

}
class Dog
{
 void bark()
 {
  System.out.print("¨L¨L");
 }
}

class WolfDog extends Dog
{
 void bark()
 {
  
  System.out.println("¡ã¨L¡ã¨L¡ã¶ã¡ã");
 }
}

class DoberMan extends Dog
{
 void bark()
 {
 	super.bark();
  System.out.println("¡ã¨L¨L¨L¡ã");
 }
}