import java.io.*;
public class cFileReaderTest2
{
 public static void main(String argv[]) throws IOException
 {
  String str="�ۥѤH"; 
  //FileReader���O���ϥ�
  FileReader fr=new FileReader("cFileReaderTest2.java");
  int temp=0;
  while((temp=fr.read())!=-1)
   System.out.print((char)temp);	
    
  //FileInputStream���O���ϥ� 
  FileInputStream fis=new FileInputStream("cFileReaderTest2.java");
  while((temp=fis.read())!=-1)
   System.out.print((char)temp);
   
  System.out.println(fr.getEncoding());
  //System.out.println(fis.getEncoding()); 
  fr.close();
  fis.close(); 
 }
}