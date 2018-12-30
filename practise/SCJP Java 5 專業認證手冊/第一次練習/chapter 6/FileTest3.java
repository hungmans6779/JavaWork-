import java.io.*;
public class FileTest3
{
 public static void main(String argv[])
 {
  File existDir=new File("FileDir");
  System.out.println("該目錄是否存在 : "+existDir.isDirectory());
  File existFile=new File(existDir,"FileTest2.txt");
  System.out.println("該檔案是否存在 : "+existFile.exists());
  try
  {
   FileReader fr=new FileReader(existFile);
   BufferedReader br=new BufferedReader(fr);
   String str=null;
   while((str=br.readLine())!=null)
   {
   	System.out.println(str);
   }
   br.close();
   fr.close();		
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());	
  }		
 }
}