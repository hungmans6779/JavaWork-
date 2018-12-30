import java.io.*;
public class EX7_1
{
 public static void main(String argv[])
 {
  try
  {
   FileOutputStream fos=new FileOutputStream("datainputstream.btz");	
   DataOutputStream dos=new DataOutputStream(fos);	
   dos.writeInt(511);
   dos.writeFloat(0.5f);
   dos.writeBoolean(true);
   dos.flush();
   dos.close();
   fos.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  } 
 }
}