class Animal
{
 static void getKind()
 {
  System.out.println("Animal");
 }
}
class Dog extends Animal
{
 static void getKind()
 {
  System.out.println("Dog");
 }
}
public class PolymorphismStaticTest1
{
 public static void main(String argv[])
 {
  Animal a[]={new Animal(),new Dog(),new Animal()};
  for(int i=0;i<3;i++)
  {
   a[i].getKind();
  }
 }
}