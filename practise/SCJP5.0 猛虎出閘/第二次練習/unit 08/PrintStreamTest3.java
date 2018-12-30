import java.io.*;
public class PrintStreamTest3
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
   System.out.print("�п�J�z�����(\"quit\"���������}) :");
   System.setOut(ps);
   String data;    

   while((data=br.readLine())!=null)
   {
    if(data.equals("quit")) break;
    System.out.println("�z�ҿ�J���r��O: "+data);	
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
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());	
  }		
  finally
  {
   System.out.println("���¨ϥΥ��{��");	
  }	
 }
}