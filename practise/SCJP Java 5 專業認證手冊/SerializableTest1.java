import java.io.*;
class Animal 
{
 int wight=42;
}

class Dog extends Animal implements Serializable
{
 String name;	
 Dog(String name,int wight)
 {
 	this.name=name;
 	this.wight=wight;
 }	
}

public class SerializableTest1 
{
 public static void main(String argv[])
 {
  Dog dog=new Dog("Jacky",32);	
  System.out.println("After: "+dog.name+"  "+dog.wight);
 	try
 	{
 	 ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Dog.txt"));
 	 oos.writeObject(dog);	
 	 oos.close();
 	 
 	 
 	 ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Dog.txt"));
 	 Dog dog2=(Dog)ois.readObject();
 	 System.out.println("After: "+dog2.name+"  "+dog2.wight);
 	 ois.close();
 	}	
 	catch(Exception ioe)
 	{
 	 ioe.printStackTrace();	
 	}	
 	
 }		
}