import java.io.*;
public class BufferWriterTest1
{
 public static void main(String argv[])
 {
  try
  {
   FileWriter fout=new FileWriter("FileWriter.txt",true);
   BufferedWriter bfw=new BufferedWriter(fout);	
   String data[]=new String[2];
   data[0]="Java SCJP 5.0";
   data[1]="310-055";
   for(int i=0;i<data.length;i++)
   {
    bfw.write(data[i]);
    bfw.newLine();	
   }	
   bfw.close();
   fout.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }		
 }
}