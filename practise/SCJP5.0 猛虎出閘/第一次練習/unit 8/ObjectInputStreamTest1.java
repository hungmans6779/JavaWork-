import java.io.*;
public class ObjectInputStreamTest1
{
 public static void main(String argv[])
 {
  try
  {
   FileInputStream fin=new FileInputStream("IntBean.ser");
   ObjectInputStream ofin=new ObjectInputStream(fin);
   AddIn ai=(AddIn)ofin.readObject();
   
   System.out.println("¨ä­È¬°: "+ai.getSum());
   ofin.close();
   fin.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }
  catch(ClassNotFoundException cfe)
  {
   cfe.printStackTrace();	
  }	
 }
}