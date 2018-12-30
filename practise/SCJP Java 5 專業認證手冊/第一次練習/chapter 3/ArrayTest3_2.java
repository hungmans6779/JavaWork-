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

public class ArrayTest3_2
{
 public static void main(String argv[])
 {
  Dog []dog=new Dog[5];
  int count=1;
  for(Dog d:dog)
  {
   String str="count"+count;
   d=new Dog(str);
   System.out.print(d.getName()+"\t");
   count++;
  }
 }
}