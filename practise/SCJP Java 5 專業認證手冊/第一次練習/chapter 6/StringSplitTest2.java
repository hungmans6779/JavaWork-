import java.io.*;
public class StringSplitTest2
{
 public static void main(String argv[])
 {
  try
  {
   	
   InputStreamReader is=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(is);
   System.out.print("請輸入一個IP位址 : ");
   String ip=br.readLine();
   String []ipSplit=ip.split("\\.");
   for(String s:ipSplit)
   {
   	System.out.print(s+"\t");
   }		
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }		
 }
} 