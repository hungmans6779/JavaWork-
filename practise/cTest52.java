import java.util.*;
public class cTest52 
{
 public static void main(String argv[])
 {
 	Dog dog1=new Dog("A00323");
 	Dog dog2=new Dog("A00023");
 	Dog dog3=new Dog("A00011");
 	Dog dog4=new Dog("A03433");
 	Set <Dog>hs=new TreeSet<Dog>();
 	hs.add(dog1);
 	hs.add(dog2);
 	hs.add(dog3);
 	hs.add(dog4);
 	for(Object o:hs)
 	{
 	 System.out.println(((Dog)o).getNumber());	
 	}	
 }	
}	


class Dog 
{
 private String number;	
 public Dog(String number)
 {
  this.number=number;	
 }	
 public String getNumber()
 {
 	return number;
 }	
}	
/*
class Dog implements Comparable<Dog>
{
 private String number;	
 public Dog(String number)
 {
  this.number=number;	
 }	
 public int compareTo(Dog o)
 {
 	return number.compareTo(o.getNumber());
 }	
 public String getNumber()
 {
 	return number;
 }	
}	
*/