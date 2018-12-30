class Dog
{
 private String name;
 Dog(String name)
 {
  this.name=name;
 }
 String getName()
 {
  return name;
 }
}

public class ArrayTest3_1
{
 public static void main(String argv[])
 {
  Dog [][] dog={{new Dog("Fluuy"),new Dog("Zeus")},{new Dog("Bilbo"),new Dog("Legolas"),new Dog("Bert")}};
  for(Dog []d1:dog)
  {
   for(Dog d2:d1)
   {
    System.out.print(d2.getName()+"\t");
   }
  }
 }
}