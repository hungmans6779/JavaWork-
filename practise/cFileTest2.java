import java.io.*;
public class cFileTest2
{
 public static void main(String argv[]) throws IOException
 {
  File directory=new File("D:\\【行政程式設計班學員的極重要資料】（勿砍）\\JavaTest");
  String dir[]=directory.list();
  File f;
  for(String value:dir)
  {
   f=new File(value);
   System.out.println(value+(f.isDirectory()?"是目錄":"是檔案"));
  } 
  System.gc();
 }
}