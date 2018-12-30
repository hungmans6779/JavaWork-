import java.io.*;
public class EXAME001 implements Serializable
{
 private Tree tree =new Tree();	
 public static void main(String argv[])
 {
  EXAME001 exame001=new EXAME001();
  try
  {
   FileOutputStream fs=new FileOutputStream("Forest.scr");
   ObjectOutputStream oos=new FileOutputStream(fs);
   oos.writeObject(exame001);
   oos.close();   
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }		
   	
 }	
}

class Tree
{ }