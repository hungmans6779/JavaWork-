import java.io.*;
class Animal 
{		
 String name="Animal";
 int age=5;
}
class Dog extends Animal implements Serializable
{
 int weight=30;
 int height=20;
 transient String color="Yellow";
}
public class ObjectInputStreamTest5
{
 public static void main(String argv[])
 {
  try
  {
   Dog d=new Dog();
   d.age=10;
   d.weight=100;
   System.out.println("before dog name = "+d.name);
   System.out.println("before dog age = "+d.age);
   System.out.println("before dog weight = "+d.weight);
   System.out.println("before dog height = "+d.height);
   System.out.println("before dog color = "+d.color);
   FileOutputStream fout=new FileOutputStream("Dog.ser");
   ObjectOutputStream oos=new ObjectOutputStream(fout);
   oos.writeObject(d);
   oos.flush();
   oos.close();
   fout.close();
   System.out.println("===========================================\n");
   FileInputStream fin=new FileInputStream("Dog.ser");
   ObjectInputStream ois=new ObjectInputStream(fin);
   d=(Dog)ois.readObject();
   System.out.println("after dog name = "+d.name);
   System.out.println("after dog age = "+d.age);
   System.out.println("after dog weight = "+d.weight);
   System.out.println("after dog height = "+d.height);
   System.out.println("after dog color = "+d.color);
   ois.close();
   fin.close();
   	
  }
  catch(Exception e)
  {
   e.printStackTrace();
   System.out.println(e.getLocalizedMessage());	
  }		
 }
}