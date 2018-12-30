import java.io.*;
public class PrintStreamTest1
{
 public static void main(String argv[])
 {
  try
  {
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr);
   PrintWriter pw=new PrintWriter(System.out,true);
   while(true)
   {
    System.out.print("請輸入一個字串 (\"quit\"結束離開) :");
    String data=br.readLine();
    if(data.equals("quit")) break;
    pw.println("您所輸入的字串是: "+data);
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
   System.out.println("謝謝使用本程式");	
  }	
 }
}