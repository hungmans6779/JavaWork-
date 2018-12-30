import java.io.*;
public class cFileReaderTest2
{
 public static void main(String argv[]) throws IOException
 {
  String str="自由人"; 
  //FileReader類別的使用
  FileReader fr=new FileReader("cFileReaderTest2.java");
  int temp=0;
  while((temp=fr.read())!=-1)
   System.out.print((char)temp);	
    
  //FileInputStream類別的使用 
  FileInputStream fis=new FileInputStream("cFileReaderTest2.java");
  while((temp=fis.read())!=-1)
   System.out.print((char)temp);
   
  System.out.println(fr.getEncoding());
  //System.out.println(fis.getEncoding()); 
  fr.close();
  fis.close(); 
 }
}