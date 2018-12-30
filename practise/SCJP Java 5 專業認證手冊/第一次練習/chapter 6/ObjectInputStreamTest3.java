import java.io.*;
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
 private transient Collar theCollar;
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
 private void writeObject(ObjectOutputStream os)
 {
 	try
  {	
 	 os.defaultWriteObject();
 	 os.writeInt(theCollar.getCollarSize());
 	}
 	catch(IOException io1)
 	{
 	 io1.printStackTrace();	
 	}	
 }	
 private void readObject(ObjectInputStream oi)
 {
 	try
 	{
 	 oi.defaultReadObject();
 	 theCollar=new Collar(oi.readInt());
 	}
 	catch(Exception io2)
 	{
 	 io2.printStackTrace();	
 	}		
 }	
}

public class ObjectInputStreamTest3
{
 public static void main(String argv[])
 {
  Collar c=new Collar(8);
  Dog d=new Dog(c,3);
  System.out.println("before CollarSize : "+d.getCollar().getCollarSize());
  System.out.println("before Dog age is :"+d.getAge()+" ·³");
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
   Dog d1=new Dog();
   d1=(Dog)ois.readObject();
   System.out.println("after CollarSize : "+d1.getCollar().getCollarSize());
   System.out.println("after Dog age is :"+d1.getAge()+" ·³");	
   ois.close();
   fin.close();
  	
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }		
 }
}