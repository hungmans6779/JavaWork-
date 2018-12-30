import java.io.*;
public class FileTest2
{
 public static void main(String argv[])
 {
 	try
 	{
   File myDir=new File("FileDir");
   myDir.mkdir();
   File file=new File(myDir,"FileTest2.txt");
   file.createNewFile();
   System.out.println("檔案是否存在 : "+file.exists());
   PrintWriter pw=new PrintWriter(file);
   pw.println("Hello");
   pw.println("Java");
   pw.println("SCJP");
   pw.flush();
   pw.close();
   FileReader fr=new FileReader(file);
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