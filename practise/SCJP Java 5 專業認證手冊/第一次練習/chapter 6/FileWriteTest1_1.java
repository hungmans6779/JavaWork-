import java.io.*;
public class FileWriteTest1_1
{
 public static void main(String argv[])
 {
 	int size=0;
 	char c[]=new char[128];
  try
  {
   File file=new File("FileWrite1.txt");	
   FileWriter fw=new FileWriter(file);
   fw.write("Hello\nJava\nSCJP");
   fw.flush();
   fw.close();
   FileReader fi=new FileReader("FileWrite1.txt");
   size=fi.read(c);
   System.out.println("���ɮצ@ "+size+" �r��");
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