import java.io.*;
class Play
{
 Play()
 {
  System.out.print("p");
 }
}
public class EXAME2 extends Play implements Serializable
{
 EXAME2()
 {
 	System.out.print("c");
 }		
 public static void main(String argv[])
 {
  EXAME2 e1=new EXAME2();
  try
  {
   FileOutputStream fos=new FileOutputStream("exame2.txt");	
   ObjectOutputStream oos=new ObjectOutputStream(fos);
   oos.writeObject(e1);
   fos.flush();
   oos.close();
   FileInputStream fis=new FileInputStream("exame2.txt");
   ObjectInputStream ois=new ObjectInputStream(fis);
   EXAME2 e2;
   e2=(EXAME2)ois.readObject();
   ois.close();
  }
  catch(Exception e)
  {
   e.printStackTrace();
   System.out.println(e.getMessage());
   System.out.println(e.getLocalizedMessage());	
  }		
 }
}