import java.io.*;
public class EX8_1
{
 public static void main(String argv[])
 {
  try
  {
   FileInputStream fin=new FileInputStream("datainputstream.btz");
   DataInputStream dis=new DataInputStream(fin);	
   System.out.println(dis.readInt());
   System.out.println(dis.readFloat());
   System.out.println(dis.readBoolean());
   dis.close();
   fin.close();
  } 
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }
 }
}