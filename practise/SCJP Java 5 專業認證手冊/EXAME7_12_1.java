import java.util.*;
public class EXAME7_12_1 extends HashSet<Person>
{
 public static void main(String argv[])
 {
  EXAME7_12_1 g=new EXAME7_12_1();
  g.add(new Person("Hans"));
  g.add(new Person("Lotte"));
  g.add(new Person("Jane"));
  g.add(new Person("Hans"));
  g.add(new Person("Jane"));
  System.out.println("Total: "+g.size());
 }
 public boolean add(Person o)
 {
 	System.out.println("Adding: "+o);
 	return super.add(o);
 }	
}

class Person
{
 private final String name;	
 public Person(String name)
 {
 	this.name=name;
 }	
 public String toString()
 {
  return name;	
 }	
}