import java.io.*;
class Player
{
 int x=3;		
}	

public class EXAME6_02_2 extends Player  implements Serializable
{
 static int x=10;	
 EXAME6_02_2()
 {
  System.out.print("c");	
 }		
 public static void main(String argv[])
 {
  EXAME6_02_2 c1=new EXAME6_02_2();
  try
  {
   FileOutputStream fos=new FileOutputStream("play.txt");
   ObjectOutputStream oos=new ObjectOutputStream(fos);
   oos.writeObject(c1);
   oos.close();
   FileInputStream fis=new FileInputStream("play.txt");
   ObjectInputStream ois=new ObjectInputStream(fis);
   EXAME6_02_2 c2=(EXAME6_02_2)ois.readObject();
   
   System.out.print("x = "+c2.x);
   ois.close();	
  	
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }		
 }
}