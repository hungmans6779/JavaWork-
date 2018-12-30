import java.io.*;
public class FileTest3
{
 public static void main(String argv[])
 {
  File existDir=new File("FileDir");
  System.out.println("�ӥؿ��O�_�s�b : "+existDir.isDirectory());
  File existFile=new File(existDir,"FileTest2.txt");
  System.out.println("���ɮ׬O�_�s�b : "+existFile.exists());
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