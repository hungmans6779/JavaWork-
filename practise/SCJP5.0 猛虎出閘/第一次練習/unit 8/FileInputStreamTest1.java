import java.io.*;
public class FileInputStreamTest1
{
 public static void main(String argv[])
 {
  byte buffer[]=new byte[1];
  FileInputStream fin;
  try
  {
   fin=new FileInputStream("FileInputStream.txt");
   System.out.println("檔案的長度為: "+fin.available());
   System.out.println("==============================");
   System.out.println("檔案的內容如下:");
   while(fin.read(buffer)!=-1)
   {
    System.out.print((char)buffer[0]);
   }
   fin.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  } 
 }
}