import java.io.*;
class Cat implements Serializable
{
 int age=10;
 String name="小叮檔";
}

public class ObjectInputStreamTest1_1
{
 public static void main(String argv[])
 {
  Cat c=new Cat();
  try
  {
   FileOutputStream fout=new FileOutputStream("Serializable.ser");
   ObjectOutputStream oos=new ObjectOutputStream(fout);
   oos.writeObject(c);
   oos.flush();
   oos.close();
   fout.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());	
  }	 
  try
  {
   FileInputStream fin=new FileInputStream("Serializable.ser");
   ObjectInputStream ois=new ObjectInputStream(fin);
   c=(Cat)ois.readObject();	
   System.out.println("小貓的名字是 : "+c.name);
   System.out.println("它今年是 : "+c.age+" 歲");
  }	
  catch(Exception ioe1)
  {
   ioe1.printStackTrace();	
  }	
 }
}