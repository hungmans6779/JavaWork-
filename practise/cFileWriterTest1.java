import java.io.*;
public class cFileWriterTest1
{
 public static void main(String argv[]) throws IOException
 {
  File file=new File("test.txt");
  FileWriter fw=new FileWriter(file,true);
  fw.write("�ۥѤH");
  fw.flush();
  fw.close();
 }
}