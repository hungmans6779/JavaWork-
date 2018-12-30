import java.io.*;
class Cat implements Serializable
{}

public class ObjectInputStreamTest1
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
  }	
  catch(Exception ioe1)
  {
   ioe1.printStackTrace();	
  }	
 }
}