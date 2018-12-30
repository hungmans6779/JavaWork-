import java.io.*;
public class FileTest3_1
{
 public static void main(String argv[])
 {
  File existDir=new File("FileDir");
  File existFile=new File("FileDir","FileTest2.txt");
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