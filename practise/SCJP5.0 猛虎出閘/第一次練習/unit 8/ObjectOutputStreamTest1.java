import java.io.*;
public class ObjectOutputStreamTest1
{
 public static void main(String argv[])
 {
  AddIn ai=new AddIn();
  ai.calc(1,2,3,4);
  try
  {
   FileOutputStream fout=new FileOutputStream("IntBean.ser");
   ObjectOutputStream ofout=new ObjectOutputStream(fout);
   ofout.writeObject(ai);
   System.out.println("����ǦC�Ʀs�ɦ��\�F...........");
   ofout.close();
   fout.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }
 }
}