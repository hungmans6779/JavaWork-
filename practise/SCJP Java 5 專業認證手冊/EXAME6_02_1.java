import java.io.*;
class Player implements Serializable
{
 Player()
 {
  System.out.print("p");	
 }		
}	

public class EXAME6_02_1 extends Player 
{
 EXAME6_02_1()
 {
  System.out.print("c");	
 }		
 public static void main(String argv[])
 {
  EXAME6_02_1 c1=new EXAME6_02_1();
  try
  {
   FileOutputStream fos=new FileOutputStream("play.txt");
   ObjectOutputStream oos=new ObjectOutputStream(fos);
   oos.writeObject(c1);
   oos.close();
   FileInputStream fis=new FileInputStream("play.txt");
   ObjectInputStream ois=new ObjectInputStream(fis);
   EXAME6_02_1 c2=(EXAME6_02_1)ois.readObject();
   ois.close();	
  	
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }		
 }
}