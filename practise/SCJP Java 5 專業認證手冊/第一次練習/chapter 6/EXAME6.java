import java.io.*;
class Keyboard{}
public class EXAME6 implements Serializable
{
 private Keyboard k=new Keyboard();	
 public static void main(String argv[])
 {
  EXAME6 e=new EXAME6();
  e.storeIt(e);
 }
 void storeIt(EXAME6 c)
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
 	 System.out.println("exe");	
 	}		
 }	
}