import java.io.*;
class Keyboard{}

public class EXAME6_06 implements Serializable
{
 private Keyboard k=new Keyboard();	
 public static void main(String argv[])
 {
  EXAME6_06 c=new EXAME6_06();
  c.storeIt(c); 
 }
 void storeIt(EXAME6_06 c)
 {
  try
  {
   ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("myFile"));
   oos.writeObject(c);
   oos.close();
   System.out.println("done"); 	
  }
  catch(Exception e)
  {
   System.out.println("exec");
  }			
 }	
}