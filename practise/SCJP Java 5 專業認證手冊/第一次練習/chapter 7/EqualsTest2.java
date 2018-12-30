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

public class EqualsTest2
{
 public static void main(String argv[])
 {
  Dog d1=new Dog("Marry");
  Dog d2=new Dog("Marry");
  Dog d3=new Dog("Jacky");
  System.out.println("d1.equals(d2) = "+(d1.equals(d2)));
  System.out.println("d1.equals(d3) = "+(d1.equals(d3)));
  System.out.println("d2.equals(d3) = "+(d2.equals(d3)));
  System.out.println("d1 hasCode = "+(d1.hashCode()));
  System.out.println("d2 hasCode = "+(d2.hashCode()));
  System.out.println("d3 hasCode = "+(d3.hashCode()));
 }
}