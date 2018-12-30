import java.io.*;
class Num
{
 int value=3;
 void change()
 {
 	value=10;
 }		
}	
public class ObjectInputStreamTest4 
{
 public static void main(String argv[])
 {
  Num n=new Num();
  n.change();
  System.out.println(n.value);
  try
  {
   FileOutputStream fout=new FileOutputStream("Num.ser");
   ObjectOutputStream oos=new ObjectOutputStream(fout);
   oos.writeObject(n);
   oos.flush();
   oos.close();
   fout.close();
   FileInputStream fin=new FileInputStream("Num.ser");
   ObjectInputStream ois=new ObjectInputStream(fin);
   Num n1=new Num();
   n1=(Num)ois.readObject();
   System.out.println(n1.value);
   ois.close();
   fin.close();	
  }
  catch(Exception ioe)
  {
  	
  }		
 }
}