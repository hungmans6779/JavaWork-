import java.io.*;
public class PrintWriterTest22
{
 public static void main(String rgv[])
 {
  try
  {
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr);
   PrintWriter pw=new PrintWriter(System.out,true);
   while(true)
   {
    System.out.print("�п�J�z�����(\"quit\"���������}) :");
    String data=br.readLine();
    if(data.equals("quit")) break;
    System.out.print("�z��J���r��O :");
    pw.println(data);	
   }	
   pw.close();
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