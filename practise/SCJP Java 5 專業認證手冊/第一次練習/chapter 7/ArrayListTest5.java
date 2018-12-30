import java.util.*;
class Dog
{
 String name;
 Dog(String name)
 {
  this.name=name;
 }
}
public class ArrayListTest5
{
 public static void main(String argv[])
 {
  ArrayList<Dog> list=new ArrayList<Dog>();
  Dog d=new Dog("One");
  list.add(d);
  list.add(new Dog("Two"));
  list.add(new Dog("Three"));
  Iterator <Dog> dd=list.iterator();
  while(dd.hasNext())
  { System.out.print(((Dog)dd.next()).name+"\t");	}	
  System.out.println("\nsize = "+list.size());
  System.out.println("get(1).name = "+list.get(1).name);
  System.out.println("indexOf() = "+list.indexOf(d));
  list.remove(2);
  Object []o=list.toArray();
  for(Object oo:o)
  { System.out.print(((Dog)oo).name+"\t");}	
  
  
 }
}