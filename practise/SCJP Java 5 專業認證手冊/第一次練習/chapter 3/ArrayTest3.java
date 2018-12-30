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

public class ArrayTest3
{
 public static void main(String argv[])
 {
  Dog puppy=new Dog("Frood");
  Dog []d={puppy,new Dog("Clover"),new Dog("Aiko")};
  for(Dog dog:d)
  {
   System.out.print(dog.getName()+"\t");
  }
 }
}