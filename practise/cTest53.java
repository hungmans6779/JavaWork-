import java.util.*;
class MyCompator implements Comparator<Dog>
{
 public int compare(Dog o1,Dog o2)
 {
 	return 1;
 }
 public boolean equals(Object obj)
 {
 	return true;
 }	 	
}

class Dog implements Comparable<Dog>
{
 private String number;	
 public Dog(String number)
 {
  this.number=number;	
 }	
 public Dog()
 {}
 public String getNumber()
 {
 	return number;
 }	
 public int compareTo(Dog o)
 {
 	return number.compareTo(o.getNumber());
 }	
}	

public class cTest53
{
 public static void main(String argv[])
 {
 	MyCompator my=new MyCompator();
  PriorityQueue pq=new PriorityQueue(1,my);
  pq.add(new Dog("A00001"));
  pq.add(new Dog("A00043"));
  pq.add(new Dog("A00023"));
  pq.add(new Dog("A00021"));
  
  for(Object o:pq)
  {
   System.out.println(((Dog)o).getNumber());	
  }	
  
 }
}
