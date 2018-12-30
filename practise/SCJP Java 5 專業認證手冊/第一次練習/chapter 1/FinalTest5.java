class Animal
{
 int i=10;	
}
class Zoo extends Animal
{}


public class FinalTest5
{
 volatile int kk=10;
 transient int tt=10;	
 public static void main(String argv[])
 {
  final Animal a=new Animal();
  //a=new Zoo();
  System.out.println(a.i);
  a.i=20;
  System.out.println(a.i); 
 }
}