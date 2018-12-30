import java.io.*;
public class cTest7
{
 public static void main(String argv[])
 {
  try
  {
   File file=new File("d:\\test.txt");
   if(file.exists())
   {
    System.out.println("檔案已經存在");	
   }
   else
   {
    if(!file.createNewFile())
     System.out.println("檔案建立失敗");  
   }	
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }
 }
}