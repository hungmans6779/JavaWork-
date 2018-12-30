import java.io.*;
public class PrintWriterTest21
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
   	System.out.print("請輸入一個字串 (\"quit\"為結束) : ");
   	String data=br.readLine();
   	if(data.equals("quit")) break;
   	System.out.print("您輸入的字串是:");
   	pw.println(data);
   }		
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