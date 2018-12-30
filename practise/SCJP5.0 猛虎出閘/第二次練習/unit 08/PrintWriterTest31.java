import java.io.*;
public class PrintWriterTest31
{
 public static void main(String argv[])
 {
  try
  {
   InputStreamReader isr=new InputStreamReader(System.in);	
   BufferedReader br=new BufferedReader(isr);
   FileOutputStream fos=new FileOutputStream("SampleFile3.txt");
   BufferedOutputStream bos=new BufferedOutputStream(fos);
   PrintStream ps=new PrintStream(bos,true);
   System.out.println("�п�J�z�����(\"quit\"���������}) :");	
   System.setOut(ps);
   while(true)
   {
   	String data=br.readLine();
    if(data.equals("quit")) break;
    System.out.println("�z��J����ƬO:"+data);
   }	
   ps.flush();
   ps.close();
   bos.close();
   fos.close();
   br.close();
   isr.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }	
  finally
  {
   System.out.println("���¨ϥΥ��{��");	
  }	
 }
}