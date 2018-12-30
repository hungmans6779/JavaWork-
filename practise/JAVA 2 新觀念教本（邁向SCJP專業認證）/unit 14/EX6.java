import java.io.*;
public class EX6
{
 public static void main(String argv[]) throws IOException
 {
  if(argv.length<1)
  {
   System.out.println("請輸入一個欲存檔的檔案名稱");
   return;	
  }	
  FileWriter fw=new FileWriter(argv[0]);
  BufferedWriter bfw=new BufferedWriter(fw);
  InputStreamReader in=new InputStreamReader(System.in);
  BufferedReader bin=new BufferedReader(in);
  String str;
  System.out.println("請開始輸入一的文章吧------(結束時，請在新的行列輸入q 離開)");
  while(!(str=bin.readLine()).equals("q"))
  {
   bfw.write(str);
   bfw.newLine();	
  }	
  bin.close();
  in.close();
  bfw.flush();
  bfw.close();
  fw.close();
 }
}