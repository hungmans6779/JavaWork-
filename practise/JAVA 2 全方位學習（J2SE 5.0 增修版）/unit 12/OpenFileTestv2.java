import java.io.*;
public class OpenFileTestv2
{
 static String fileName="";
 public static void main(String argv[])
 { 
  do
  {
   try
   {
    System.out.println("\n\n\n\n\n\n");
    System.out.print("請輸入您要開啟的檔案名稱 :");
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    fileName=br.readLine(); 
    openFile(fileName);
    break;
   }
   catch(IOException e)
   {
    e.printStackTrace();
   }
  }while(true);
  System.out.println("您的 '"+fileName+" ' 開啟成功........");
 }
 public static void openFile(String fileName) throws FileNotFoundException
 {
  FileInputStream f=new FileInputStream(fileName);
 }
}