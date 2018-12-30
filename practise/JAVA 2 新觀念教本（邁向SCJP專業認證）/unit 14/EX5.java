import java.io.*;
public class EX5
{
 public static void main(String argv[]) throws IOException
 {
  if(argv.length<1)
  {
   System.out.println("請入一個檔案的名稱");
   return;	
  }	
  FileReader fin=new FileReader(argv[0]);
  BufferedReader bfin=new BufferedReader(fin);
  String str;
  while((str=bfin.readLine())!=null)
  {
   System.out.println(str);	
  }	
  bfin.close();
  fin.close();
 }
}