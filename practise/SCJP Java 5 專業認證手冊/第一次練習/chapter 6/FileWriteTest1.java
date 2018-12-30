import java.io.*;
public class FileWriteTest1
{
 public static void main(String argv[])
 {
 	int size=0;
 	char c[]=new char[128];
  try
  {
   FileWriter fw=new FileWriter("FileWrite1.txt");
   fw.write("Hello\nJava\nSCJP");
   fw.flush();
   fw.close();
   FileReader fi=new FileReader("FileWrite1.txt");
   size=fi.read(c);
   System.out.println("此檔案共 "+size+" 字元");
   for(char num:c)
   {
   	System.out.print(num);
   }	
   fi.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());
  }
 }
}