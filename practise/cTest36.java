class Animal
{
 String name;	
 public Animal(String name)
 {
 	this.name=name;
 }		
}	

class People
{

}

class Student extends People
{
 public Student(String name)
 {
 	this.name=name;
 }	
 String name;
 public boolean equals(Object o)
 {
  if((o instanceof Student) && ((Student)o).name.equals(name))
   return true;
  else
   return false;
  
 }
}

public class cTest36
{
 public static void main(String argv[])
 {
 	Animal a=new Animal("�b��");
  People p1=new Student("�b��");
  Student p2=new Student("�b��");
  System.out.println(p1.equals(p2)); 
  System.out.println(p1.equals(a));
 }
}