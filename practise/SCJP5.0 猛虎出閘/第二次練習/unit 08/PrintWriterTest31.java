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
   System.out.println("請輸入您的資料(\"quit\"結束並離開) :");	
   System.setOut(ps);
   while(true)
   {
   	String data=br.readLine();
    if(data.equals("quit")) break;
    System.out.println("您輸入的資料是:"+data);
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
   System.out.println("謝謝使用本程式");	
  }	
 }
}