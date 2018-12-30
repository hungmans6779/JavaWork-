import java.io.*;
public class cBufferedReaderTest1
{
 public static void main(String argv[]) throws IOException
 {
  FileReader fr=new FileReader("cBufferedReaderTest1.java");
  BufferedReader br=new BufferedReader(fr);
  String str="";
  while((str=br.readLine())!=null)
   System.out.println(str);
   
  br.close();
  fr.close();
 }
}