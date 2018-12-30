import java.util.*;
class Dog
{
 private String name;
 public Dog(String name)
 {
  this.name=name;
 }
 
 public boolean equals(Object o)
 {
 	if((o instanceof Dog) && (((Dog)o).name==this.name))
 	{
 	 	return true;
 	}	
  else
 	{
 		return false;
 	}	
 }
 public int hashCode()
 {
 	return name.length();
 }	
}

public class EqualsTest3
{
 public static void main(String argv[])
 {
  Map<Dog,String> dog=new HashMap<Dog,String>();
  dog.put(new Dog("Marry"),"aa");
  dog.put(new Dog("Jacky"),"bb");
  Dog d1=new Dog("Marry");
  System.out.println(dog.get(d1));
 }
}