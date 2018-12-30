import java.io.*;
public class ObjectInputStreamTest2_2 implements Serializable
{
 public static void main(String argv[])
 {
 	ObjectInputStreamTest2_2.Collar c=new ObjectInputStreamTest2_2().new Collar(8);
  ObjectInputStreamTest2_2.Dog d=new ObjectInputStreamTest2_2().new Dog(c,3);
  System.out.println("before CollarSize : "+d.getCollar().getCollarSize());
  System.out.println("before Dog age is :"+d.getAge()+" ��");
  try
  {
   FileOutputStream fout=new FileOutputStream("Dog.ser");
   ObjectOutputStream oos=new ObjectOutputStream(fout);	
   oos.writeObject(d);
   oos.flush();
   oos.close();
   fout.close();
  }	
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }	
  try
  {
   FileInputStream fin=new FileInputStream("Dog.ser");
   ObjectInputStream ois=new ObjectInputStream(fin);
   ObjectInputStreamTest2_2.Dog d1=new ObjectInputStreamTest2_2().new Dog();
   d1=(Dog)ois.readObject();
   System.out.println("after CollarSize : "+d1.getCollar().getCollarSize());
   System.out.println("after Dog age is :"+d1.getAge()+" ��");	
   ois.close();
   fin.close();
  	
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }	
 }	
class Collar implements Serializable
{
 private int collarSize;
 Collar(int size)
 {
  collarSize=size;
 }
 public int getCollarSize()
 {
  return collarSize;
 }
}
 class Dog implements Serializable
 {
  Collar theCollar;
  private int age;
  Dog()
  { }	
  Dog(Collar c,int age)
  {
   theCollar=c;
   this.age=age;
  }
  public int getAge()
  {
  	return age;
  }	
  public Collar getCollar()
  {
   return theCollar;	
  }	
 }
}