import java.io.*;

class Dog implements Serializable
{
 static int age=10;
}

public class ObjectInputStreamTest6
{
 public static void main(String argv[])
 {
  Dog d1=new Dog();
  Dog d2=new Dog();
  Dog d3=new Dog();
  d1.age=20;
  d2.age=30;
  d3.age=40;
  Dog d=new Dog();
  try
  {
   System.out.println("before age = "+d.age);
   FileOutputStream fout=new FileOutputStream("Dog1.ser");
   ObjectOutputStream oos=new ObjectOutputStream(fout);
   oos.writeObject(d);
   oos.flush();
   oos.close();
   fout.close();
   System.out.println("===========================================\n");
   FileInputStream fin=new FileInputStream("Dog1.ser");
   ObjectInputStream ois=new ObjectInputStream(fin);
   d=(Dog)ois.readObject();
   System.out.println("after age = "+d.age);
   ois.close();
   fin.close();
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }	
 }
}