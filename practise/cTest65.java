import java.io.*;
class Student implements Serializable
{
 private String name;
 private int age;
 private String sex;
 public Student(String name,int age,String sex)
 {
  this.name=name;
  this.age=age;
  this.sex=sex;
 }
 Dog dog=new Dog("jime");
 public String getName()
 {
 	return name;
 }	
 public String getSex()
 {
 	return sex;
 }	
 public int getAge()
 {
 	return age;
 }	
}

class Dog implements Serializable
{
 String name;
 public Dog(String name)
 {
 	this.name=name;
 }		
}	

public class cTest65
{
 public static void main(String argv[])
 {
 	Student s=new Student("Hung Chia Hung",28,"�k");
 	try
 	{
   ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student.ser")); 		
   //s.dog.name="hacker";
 	 oos.writeObject(s);	
 	}	
 	catch(IOException ioe)
 	{
 	 ioe.printStackTrace();	
 	}	
 	Student ss=null;
 	try
 	{
 	 ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student.ser"));
 	 ss=(Student)ois.readObject();
 	}
 	catch(Exception ioe)
 	{
 	 ioe.printStackTrace();	
 	}	
 	System.out.println("�ǥͩm�W�G"+ss.getName());
 	System.out.println("�ǥͦ~�֡G"+ss.getAge());
 	System.out.println("�ǥͩʧO�F"+ss.getSex());
 	System.out.println("�����W�r�O�G"+ss.dog.name);
 }	
}