import java.io.*;
public class FileTest4
{
 public static void main(String argv[])
 {
  String path="H:\\javawork\\practise\\猛虎出閘\\unit 8\\";
  File f1=new File(path);
  String data[]=f1.list();
  for(int i=0;i<data.length;i++)
  {
   File f2=new File(path+data[i]);
   //System.out.println(f2.getAbsolutePath());
   if(f2.isFile())
   {
    System.out.println(data[i]+" 是檔案.");
   }
   else
   {
    System.out.println(data[i]+" 是目錄.");
   }
  }
 }
}