import java.io.*;
public class ObjectOutputStreamTest2
{
 public static void main(String argv[])
 {
  AddInTest2 ai=new AddInTest2();
  ai.calc(1,2,3,4);
  try
  {
   FileOutputStream fout=new FileOutputStream("IntBean.ser");
   ObjectOutputStream ofout=new ObjectOutputStream(fout);
   ofout.writeObject(ai);
   System.out.println("物件序列化存檔成功了...........");
   ofout.close();
   fout.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }
 }
}