import java.io.*;
public class InputStreamReaderTest2
{
 public static void main(String argv[])
 {
  try
  {
   InputStreamReader fin=new InputStreamReader(System.in);
   BufferedReader bfin=new BufferedReader(fin);	
   PrintWriter pw=new PrintWriter(System.out,true);	
   String data;
   while(true)
   {
   	System.out.print("�п�J���: ");
   	data=bfin.readLine();
   	if(data.equals("quit"))
   	{ 
   	 bfin.close();
   	 fin.close();
   	 pw.close();
   	 break; 
    }
   	pw.println("�z��~��J���r�ꬰ: "+data);
   }	
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }		
 }	
}