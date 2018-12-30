import java.io.*;
public class FileTest5
{
 public static void main(String argv[])
 {
  String show[]=new String[100];
  File file=new File("FileDir");
  show=file.list();
  for(String str:show)
  {
   	
   System.out.println(str);	
  }	
 }
}