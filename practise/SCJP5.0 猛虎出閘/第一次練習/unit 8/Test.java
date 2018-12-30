import java.io.*;
public class Test
{
 public static void main(String argv[])
 {
  String s="Java 輸入與輸出（java.io函式庫）";
  byte data[]=s.getBytes();
  System.out.println("將字串 \""+s+"\" 寫到檔案中");
  System.out.println("資料長度: "+data.length+" Bytes.");
  try
  {
   System.out.println("在檔案系統產生了一個FileOutputStream.txt的實體檔案");	
   FileOutputStream fout=new FileOutputStream("FileOutputStream.txt",true);
   for(int i=0;i<Integer.MAX_VALUE;i++)
   {
    fout.write(data);	
   } 
   fout.close();
  }	
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }	
 }
}