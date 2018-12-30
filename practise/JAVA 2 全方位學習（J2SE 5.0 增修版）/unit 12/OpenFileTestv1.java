import java.io.*;
public class OpenFileTestv1
{
 static String fileName="";
 public static void main(String argv[])
 {
  do
  {
   System.out.print("請輸入一個檔案名稱: ");
   InputStreamReader ir=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(ir);
   try
   {
     fileName=br.readLine();
   }
   catch(IOException e)
   {
    e.printStackTrace();
   }
  }while(!openFile(fileName));
  System.out.println("開啟檔案成功");
 }
 public static boolean openFile(String fileName)
 {
  try
  {
   FileInputStream f=new FileInputStream(fileName);
   return true;
  }
  catch(FileNotFoundException e)
  {
   e.printStackTrace();
   return false;
  }
 }
}