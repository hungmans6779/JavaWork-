class Animal{}
class Dog{}
public class BooleanTest4_1
{
 public static void main(String argv[])
 {
  Dog d=new Dog();
  boolean b;
  if(d instanceof Animal)
  {
   System.out.println(true);  	
  }	
 }
}