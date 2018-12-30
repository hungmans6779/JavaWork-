import java.io.*;
public class cFileReaderTest1
{
 public static void main(String argv[]) throws IOException
 {
 	/*
 	//方法 1
  File file=new File("cFileReaderTest1.java");
  if(file.exists())
  {
   FileReader fr=new FileReader(file);
   for(int i=0;i<file.length();i++)
   { 
   	System.out.print((char)fr.read());
   }		
  }	
  */
  

  /*
  //方法2
  FileReader fr2=new FileReader("cFileReaderTest1.java");
  while(true)
  {
   int temp=fr2.read();
   if(temp==-1)
    break;
   System.out.print((char)temp);	
  }	
  */
  
  
  //方法3
  FileReader fr1=new FileReader("cFileReaderTest1.java");
  int temp=0;
  while((temp=fr1.read())!=-1)
   System.out.print((char)temp);	
 }
}