import java.io.*;
public class FileTest4
{
 public static void main(String argv[])
 {
 	try
 	{
   File delDir=new File("delDir");
   System.out.println("delDir是否被建立 : "+delDir.mkdir());
   System.out.println("delDir是否為目錄 : "+delDir.isDirectory());
   File newFile1=new File(delDir,"newFile1.txt");
   System.out.println("newFile1.txt 是否被建立 : "+newFile1.createNewFile());
   File newFile2=new File(delDir,"newFile2.txt");
   System.out.println("newFile2.txt 是否被建立 : "+newFile2.createNewFile());
   System.out.println("newFile2.txt 是否被刪除 : "+newFile2.delete());
   System.out.println("delDir 目錄是否被刪除了 : "+delDir.delete());
   File rename=new File(delDir,"我是誰.txt");
   System.out.println("newFile1.txt是否被更名為<<我是誰.txt>> : "+newFile1.renameTo(rename));
   File renameDir=new File("生我之時我是誰，生我之前誰是我");
   System.out.println("delDir 目錄是否被更名為<<生我之時我是誰，生我之前誰是我>> : "+delDir.renameTo(renameDir));
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());	
  }	 
 }
}