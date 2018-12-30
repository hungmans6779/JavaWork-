import java.io.*;
public class BufferedWriterTest1
{
 public static void main(String argv[])
 {
  try
  {
   String data[]=new String[2];
   data[0]="JAVA SCJP";
   data[1]="310-055";
   FileWriter fw=new FileWriter("SampleFile.txt",true);
   BufferedWriter bw=new BufferedWriter(fw);
   for(int i=0;i<data.length;i++)
   {
    bw.newLine();
    bw.write(data[i]);	
   }		
   bw.close();
   fw.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());	
  }
  finally
  {
   System.out.println("謝謝使用本程式");	
  }			
 }
}