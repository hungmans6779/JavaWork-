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
   System.out.print("請輸入您的資料(\"quit\"結束並離開) :");
   System.setOut(ps);
   String data;    

   while((data=br.readLine())!=null)
   {
    if(data.equals("quit")) break;
    System.out.println("您所輸入的字串是: "+data);	
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
   System.out.println("謝謝使用本程式");	
  }	
 }
}